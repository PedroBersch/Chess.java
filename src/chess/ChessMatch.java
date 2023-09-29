package chess;

import boardgame.Board;
import boardgame.Position;
import chessPieces.King;
import chessPieces.Rook;

public class ChessMatch {
    private Board board;
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }
    //Get matrix of pieces
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
        for (int i = 0 ; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumn(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(3,2));
    }
}
