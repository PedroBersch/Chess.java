package boardgame;

public class Piece {
    protected Position position;
    protected Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public Position getPosition() {
        return position;
    }

    protected Board getBoard() {
        return board;
    }

}
