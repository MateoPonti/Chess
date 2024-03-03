package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Pawn extends Piece {
    private  boolean firstMove=false;

    public Pawn(Color c, Position p){
        super(c,p);
    }

    @Override
    public ArrayList<Position> calculateMovements() {
        Boolean b= getColor()==Color.WHITE;
        ArrayList<Position> positions= new ArrayList<>();
        Position p=getPosition();


        positions.add(Position.moovePosition(p,-1,1,b));
        positions.add(Position.moovePosition(p,0,1,b));
        positions.add(Position.moovePosition(p,1,1,b));

        if (!(firstMove)){
            positions.add(Position.moovePosition(p,0,2,b));
        }

        return positions;

    }

    @Override
    public void changePosition(Position pos){
        super.changePosition(pos);
        firstMove=true;

    }
}
