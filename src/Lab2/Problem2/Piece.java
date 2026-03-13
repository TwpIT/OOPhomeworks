package Problem2;

public abstract class Piece {
    protected Position position;
    protected boolean isWhite;

    public Piece(Position position, boolean isWhite) {
        this.position = position;
        this.isWhite = isWhite;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isWhite() {
        return isWhite;
    }

    abstract boolean isLegalMove(Position b);

    public abstract String getSymbol();
}
