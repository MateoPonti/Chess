package model.pieces;

import model.Board.Board;
import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Bishop  extends Piece{

    public Bishop(Color c, Position p){
        super(c,p);
    }

    @Override
    public ArrayList<Position> calculateMovements() {
        ArrayList<Position> positions= new ArrayList<>();

        int i = 1;
        while (i<Board.getSize()){
            addMove(positions,Position.moovePosition(getPosition(),-i,i,true));
            addMove(positions,Position.moovePosition(getPosition(),i,-i,true));
            addMove(positions,Position.moovePosition(getPosition(),-i,-i,true));
            addMove(positions,Position.moovePosition(getPosition(),i,i,true));

            i++;
        }

        return positions;

    }

}
