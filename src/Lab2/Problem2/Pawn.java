package Problem2;

public class Pawn extends Piece {

    public Pawn(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (position.equals(b)) return false;
        int rowDiff = b.getRow() - position.getRow();
        int colDiff = Math.abs(position.getCol() - b.getCol());

        if (isWhite) {
            if (colDiff == 0 && rowDiff == 1) return true;
            if (colDiff == 0 && rowDiff == 2 && position.getRow() == 1) return true;
        } else {
            if (colDiff == 0 && rowDiff == -1) return true;
            if (colDiff == 0 && rowDiff == -2 && position.getRow() == 6) return true;
        }
        return false;
    }

}
