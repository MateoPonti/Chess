package model.pieces;

import model.Board.Board;
import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Bishop  extends Piece{

    public Bishop(Color c){
        super(c);
    }

    @Override
    public ArrayList<Position> calculateMovements(Position pos) {
        ArrayList<Position> positions= new ArrayList<>();

        int i = 1;
        while (i<Board.getSize()){
            addMove(positions,Position.moovePosition(pos,-i,i,true));
            addMove(positions,Position.moovePosition(pos,i,-i,true));
            addMove(positions,Position.moovePosition(pos,-i,-i,true));
            addMove(positions,Position.moovePosition(pos,i,i,true));

            i++;
        }

        return positions;

    }

    @Override
    public String toString() {
        return "B";
    }
}
