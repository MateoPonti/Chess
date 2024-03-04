package model.Board;

import model.chess.Color;
import model.pieces.*;

import java.util.ArrayList;

public class Board {
    private  Piece[][] board;
    private static final int SIZEBOARD=8;

    public Board() {
     inicializar();

    }

    private  void inicializar(){
        board= new Piece[SIZEBOARD][SIZEBOARD];

        //Pawns
        for (int i=0;i<SIZEBOARD;i++){
            board[1][i]= new Pawn(Color.BLACK);
            board[6][i]= new Pawn(Color.WHITE);
        }
        //Rooks
        board[0][0]=new Rook(Color.BLACK);
        board[0][7]=new Rook(Color.BLACK);
        board[7][0]=new Rook(Color.WHITE);
        board[7][7]=new Rook(Color.WHITE);

        //Horses

        board[0][1]=new Horse(Color.BLACK);
        board[0][6]=new Horse(Color.BLACK);
        board[7][1]=new Horse(Color.WHITE);
        board[7][6]=new Horse(Color.WHITE);

        //Bishops

        board[0][2]=new Bishop(Color.BLACK);
        board[0][5]=new Bishop(Color.BLACK);
        board[7][2]=new Bishop(Color.WHITE);
        board[7][5]=new Bishop(Color.WHITE);

        //Queens

        board[0][4]=new Queen(Color.BLACK);
        board[7][4]=new Queen(Color.WHITE);

        //Kings

        board[0][3]=new King(Color.BLACK);
        board[7][3]=new King(Color.WHITE);

    }
    public static  int getSize() {
        return  SIZEBOARD;}


    @Override
    public String toString() {
        StringBuilder boardS= new StringBuilder();

        for (int i = 0; i<Board.getSize();i++) {
            for (int j = 0; j<Board.getSize();j++) {
                String s="";
                if (j == 0){
                  s+=(SIZEBOARD-i)+" | ";
                }
                if (board[i][j]!=null){
                    s+=" "+board[i][j].toString()+" ";}
                else {
                    s+=" - ";
                }
                boardS.append(s);
            }
            boardS.append("\n");
        }

        for (int i = 0; i<Board.getSize()-1;i++) {
            boardS.append("----");
        }
        boardS.append("\n");

        String s="    ";
        for (int letter = 'A'; letter <= 'H'; letter++) {
            s+=" "+(char) letter+" ";
        }
        boardS.append(s);


        return boardS.toString();
    }
}
