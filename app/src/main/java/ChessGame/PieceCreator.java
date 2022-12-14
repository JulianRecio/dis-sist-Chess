package ChessGame;

import Enums.Color;
import Enums.GameMode;
import Enums.PieceType;
import Interfaces.Board;

import java.util.Arrays;
import java.util.List;

public class PieceCreator {

    public void insertPiecesInBoard(Board board, GameMode gameMode) {

        switch (gameMode){
            case CAPABLANCA -> {
                Piece[] blackPiecesArray = {
                        new Piece(PieceType.ROOK, Color.BLACK),
                        new Piece(PieceType.KNIGHT, Color.BLACK),
                        new Piece(PieceType.CHANCELLOR, Color.BLACK),
                        new Piece(PieceType.BISHOP, Color.BLACK),
                        new Piece(PieceType.KING, Color.BLACK),
                        new Piece(PieceType.QUEEN, Color.BLACK),
                        new Piece(PieceType.BISHOP, Color.BLACK),
                        new Piece(PieceType.ARCHBISHOP, Color.BLACK),
                        new Piece(PieceType.KNIGHT, Color.BLACK),
                        new Piece(PieceType.ROOK, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK)
                };

                List<Piece> blacks = Arrays.asList(blackPiecesArray);

                Piece[] whitePiecesArray = {
                        new Piece(PieceType.ROOK, Color.WHITE),
                        new Piece(PieceType.KNIGHT, Color.WHITE),
                        new Piece(PieceType.CHANCELLOR, Color.WHITE),
                        new Piece(PieceType.BISHOP, Color.WHITE),
                        new Piece(PieceType.KING, Color.WHITE),
                        new Piece(PieceType.QUEEN, Color.WHITE),
                        new Piece(PieceType.BISHOP, Color.WHITE),
                        new Piece(PieceType.ARCHBISHOP, Color.WHITE),
                        new Piece(PieceType.KNIGHT, Color.WHITE),
                        new Piece(PieceType.ROOK, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE)
                };

                List<Piece> whites = Arrays.asList(whitePiecesArray);

                for (int i = 0; i < whites.size(); i++) {
                    board.getPositions().get(i).setPiece(whites.get(i));
                    whites.get(i).setInitialPositionValues(board.getPositions().get(i).getHorizontalPosition(),board.getPositions().get(i).getVerticalPosition());
                }

                int j = 0;
                for (int i = board.getPositions().size()-1; i >= board.getPositions().size()-blacks.size(); i--, j++) {
                    board.getPositions().get(i).setPiece(blacks.get(j));
                    blacks.get(j).setInitialPositionValues(board.getPositions().get(i).getHorizontalPosition(),board.getPositions().get(i).getVerticalPosition());;
                }
            }
            default -> {
                Piece[] blackPiecesArray = {
                        new Piece(PieceType.ROOK, Color.BLACK),
                        new Piece(PieceType.KNIGHT, Color.BLACK),
                        new Piece(PieceType.BISHOP, Color.BLACK),
                        new Piece(PieceType.KING, Color.BLACK),
                        new Piece(PieceType.QUEEN, Color.BLACK),
                        new Piece(PieceType.BISHOP, Color.BLACK),
                        new Piece(PieceType.KNIGHT, Color.BLACK),
                        new Piece(PieceType.ROOK, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK),
                        new Piece(PieceType.PAWN, Color.BLACK)
                };

                List<Piece> blacks = Arrays.asList(blackPiecesArray);

                Piece[] whitePiecesArray = {
                        new Piece(PieceType.ROOK, Color.WHITE),
                        new Piece(PieceType.KNIGHT, Color.WHITE),
                        new Piece(PieceType.BISHOP, Color.WHITE),
                        new Piece(PieceType.QUEEN, Color.WHITE),
                        new Piece(PieceType.KING, Color.WHITE),
                        new Piece(PieceType.BISHOP, Color.WHITE),
                        new Piece(PieceType.KNIGHT, Color.WHITE),
                        new Piece(PieceType.ROOK, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE),
                        new Piece(PieceType.PAWN, Color.WHITE)
                };

                List<Piece> whites = Arrays.asList(whitePiecesArray);

                for (int i = 0; i < whites.size(); i++) {
                    board.getPositions().get(i).setPiece(whites.get(i));
                    whites.get(i).setInitialPositionValues(board.getPositions().get(i).getHorizontalPosition(),board.getPositions().get(i).getVerticalPosition());
                }

                int j = 0;
                for (int i = board.getPositions().size()-1; i >= board.getPositions().size()-blacks.size(); i--, j++) {
                    board.getPositions().get(i).setPiece(blacks.get(j));
                    blacks.get(j).setInitialPositionValues(board.getPositions().get(i).getHorizontalPosition(),board.getPositions().get(i).getVerticalPosition());;
                }
            }
        }

    }
}
