package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;


public abstract class ChessPiece extends Piece {
    private int moveCount;
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        moveCount = 0;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public int getMoveCount(){
        return moveCount;
    }
    public void increaseMoveCount(){
        moveCount++;
    }
    public void decreaseMoveCount(){
        moveCount--;
    }
    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }
    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
