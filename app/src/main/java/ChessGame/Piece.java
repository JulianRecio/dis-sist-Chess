package ChessGame;

import Enums.Color;
import Enums.PieceType;

public class Piece {
    private int initialX;
    private int initialY;
    private PieceType type;
    private final Color color;

    public Piece(PieceType type, Color color) {
        this.type = type;
        this.color = color;
    }

    public int[] getInitialPositionValues() {
        return new int[]{initialX, initialY};
    }

    public PieceType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    private void setInitialX(int initialX) {
        this.initialX = initialX;
    }

    private void setInitialY(int initialY) {
        this.initialY = initialY;
    }

    public void setInitialPositionValues(int horizontalPosition, int verticalPosition) {
        setInitialX(horizontalPosition);
        setInitialY(verticalPosition);
    }

    public void setPromotion(PieceType promotion) {
        this.type = promotion;
    }

}
