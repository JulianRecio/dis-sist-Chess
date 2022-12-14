package Validation;

import ChessGame.*;
import Enums.*;
import Exceptions.PositionWithoutPieceException;
import Interfaces.Board;

public class PositionValidator {
    //validar las posiciones
    public boolean validate(boolean p1turn, Board board, Position startPosition, Position finalPosition) {
        Color playerTurn = p1turn ? Color.WHITE : Color.BLACK;
        try {
        if (!board.getPositions().contains(startPosition) || !board.getPositions().contains(finalPosition)) return false; //no se puede validar si la posición no existe en el tablero // funciona
        if (startPosition.equals(finalPosition)) return false; // no se puede validar si la posición inicial es igual a la final // funciona
        if (startPosition.getPiece().getColor() != playerTurn) return false; // no se puede validar si la posición si no corresponde el turno // funciona
        if (!finalPosition.isEmpty()) return finalPosition.getPiece().getColor() != playerTurn;// ; // no se puede validar si la posición si tiene una pieza mia en la posición de llegada

        return true;
        } catch (PositionWithoutPieceException e) {
            //Si no hay pieza, no se puede validar
           return false;
        }
    }
}
