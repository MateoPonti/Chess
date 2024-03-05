package model.pieces;

import model.Board.Board;
import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Rook extends Piece {


    public Rook(Color c){
        super(c);
    }

    @Override
    public ArrayList<Position> calculateMovements(Position pos) {
        ArrayList<Position> positions= new ArrayList<>();

        int size = Board.getSize();

        for (int i = 1 ; i<size-pos.getY();i++){
            addMove(   positions, (Position.moovePosition(pos,0,i,true)));
        }

        for (int i = 1 ; i<pos.getY();i++){
            addMove(   positions, (Position.moovePosition(pos,0,i,false)));

        }

        for (int i = 1 ; i<size-pos.getX();i++){
            addMove(   positions, (Position.moovePosition(pos,i,0,true)));
        }

        for (int i = 1 ; i<pos.getX();i++){
            addMove(   positions, (Position.moovePosition(pos,i,0,false)));
        }

        return positions;

    }

}
