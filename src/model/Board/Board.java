package model.Board;

import model.chess.Color;
import model.pieces.Pawn;
import model.pieces.Piece;

import java.util.ArrayList;

public class Board {
    private  Piece[][] board;
    private static final int SIZEBOARD=7;

    public Board() {
     board= new Piece[SIZEBOARD][SIZEBOARD];


    }

    private  void inicializar(){
        for (int i=0;i<=SIZEBOARD;i++){
            board[1][i]= new Pawn(Color.WHITE);
        }
    }
    public static  int getSize() {
        return  SIZEBOARD;}

}
