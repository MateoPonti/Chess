package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class King extends Piece{


    public King(Color color) {
        super(color);
    }

    @Override
    public ArrayList<Position> calculateMovements(Position pos) {
        ArrayList<Position> positions=new ArrayList<>();
        addMove(positions,Position.moovePosition(pos,1,1,true));
        addMove(positions,Position.moovePosition(pos,1,-1,true));
        addMove(positions,Position.moovePosition(pos,-1,1,true));
        addMove(positions,Position.moovePosition(pos,-1,-1,true));
        addMove(positions,Position.moovePosition(pos,0,1,true));
        addMove(positions,Position.moovePosition(pos,0,-1,true));
        addMove(positions,Position.moovePosition(pos,1,0,true));
        addMove(positions,Position.moovePosition(pos,-1,0,true));
        return positions;
    }
}
