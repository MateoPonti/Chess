package model.pieces;

import model.Board.Board;
import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Pawn extends Piece {


    public Pawn(Color c){
        super(c);
    }

    @Override
    public ArrayList<Position> calculateMovements(Position pos) {
        Boolean b= getColor()==Color.WHITE;
        ArrayList<Position> positions= new ArrayList<>();



        addMove(   positions, Position.moovePosition(pos,-1,1,b));
        addMove(   positions, Position.moovePosition(pos,0,1,b));
        addMove(   positions, Position.moovePosition(pos,1,1,b));

        if (isFirstMove(pos)){
            addMove( positions, Position.moovePosition(pos,0,2,b));
        }

        return positions;

    }

    public boolean isFirstMove(Position pos) {
        return (Color.WHITE==getColor() && pos.getX()==1) || (Color.BLACK==getColor() && pos.getX()==6);
    }

    @Override
    public String toString() {
        return "P";
    }
}

