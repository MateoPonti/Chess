package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Horse extends Piece {

    public Horse(Color c, Position p){
        super(c,p);
    }
    @Override
    public ArrayList<Position> calculateMovements() {
        ArrayList<Position> positions=new ArrayList<>();
        Position p=getPosition();

        addMove(positions,Position.moovePosition(p,1,2,true));
        addMove(positions,Position.moovePosition(p,1,2,false));

        addMove(positions,Position.moovePosition(p,-1,2,true));
        addMove(positions,Position.moovePosition(p,-1,2,false));


        addMove(positions,Position.moovePosition(p,2,1,true));
        addMove(positions,Position.moovePosition(p,2,1,false));

        addMove(positions,Position.moovePosition(p,-2,1,true));
        addMove(positions,Position.moovePosition(p,-2,1,false));

        return positions;
    }
}
