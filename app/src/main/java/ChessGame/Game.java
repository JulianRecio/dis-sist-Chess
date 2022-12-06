package ChessGame;

import Enums.GameMode;
import Enums.PieceType;
import Exceptions.InvalidMoveException;
import Exceptions.PositionWithoutPieceException;
import Exceptions.VictoryException;
import Interfaces.Board;
import Validation.Validator;


public class Game implements Interfaces.Game {

    private final GameMode gameMode;
    private final Board board;
    private boolean p1turn;
    private final Validator validator;
    private PieceMover pieceMover;
    private Promoter promoter;


    public Game(GameMode gameMode) {
        this.gameMode = gameMode;
        this.board = generateBoard(gameMode);
        this.p1turn = true; // CAMBIAR AL TERMINAR A TRUE
        this.validator = new Validator(gameMode);
        this.pieceMover = PieceMover.getInstance();
        this.promoter = promoterType(gameMode);
    }

    private Promoter promoterType(GameMode gameMode) {
        switch (gameMode){
            case CLASSIC -> { return new Promoter(PieceType.PAWN, PieceType.QUEEN);}
            default -> { return new Promoter(PieceType.PAWN, PieceType.PAWN); }
        }
    }

    @Override
    public void movePiece(int startX, int startY, int finishX, int finishY) throws PositionWithoutPieceException, InvalidMoveException, VictoryException {
        Position startPosition = board.getPosition(startX, startY);
        Position finishPosition = board.getPosition(finishX, finishY);

        if (!validator.validateMove(p1turn,board, startPosition, finishPosition)) throw new InvalidMoveException("Invalid move!");
        pieceMover.movePiece(board, startPosition, finishPosition); // funciona
        promoter.verifyForPromotion(p1turn,board, startPosition, finishPosition); // funciona
        this.p1turn = !this.p1turn; // cambiar turno funciona
        validator.validateVictory(p1turn,board, startPosition, finishPosition); // no funciona
    }

    private Board generateBoard(GameMode gameMode) {
        //Solo genera el board clasico
        switch (gameMode){
            case CAPABLANCA -> {
                BoardCreator boardCreator = new BoardCreator();
                Board board = boardCreator.create(10, 8);
                PieceCreator pieceCreator = new PieceCreator();
                pieceCreator.insertPiecesInBoard(board, gameMode);
                return board;
            }
            default -> {
                BoardCreator boardCreator = new BoardCreator();
                Board board = boardCreator.create(8, 8);
                PieceCreator pieceCreator = new PieceCreator();
                pieceCreator.insertPiecesInBoard(board, gameMode);
                return board;
            }
        }
    }
    public Board getBoard() {
        return board;
    }

    public boolean isP1turn() {
        return p1turn;
    }
}
