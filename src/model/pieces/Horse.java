package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Horse extends Piece {

    public Horse(Color c){
        super(c);
    }
    @Override
    public ArrayList<Position> calculateMovements(Position pos) {
        ArrayList<Position> positions=new ArrayList<>();

        addMove(positions,Position.moovePosition(pos,1,2,true));
        addMove(positions,Position.moovePosition(pos,1,2,false));

        addMove(positions,Position.moovePosition(pos,-1,2,true));
        addMove(positions,Position.moovePosition(pos,-1,2,false));


        addMove(positions,Position.moovePosition(pos,2,1,true));
        addMove(positions,Position.moovePosition(pos,2,1,false));

        addMove(positions,Position.moovePosition(pos,-2,1,true));
        addMove(positions,Position.moovePosition(pos,-2,1,false));

        return positions;
    }

    @Override
    public String toString() {
        return "H";
    }
}
