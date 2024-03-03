package model.pieces;

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
        Position p=getPosition();

        boolean outOfRange= false;
        int size=getSIZEBOARD();
        while (!outOfRange){
            if (getPosition().getX()<5){

            }


        }

            return positions;

    }

}
