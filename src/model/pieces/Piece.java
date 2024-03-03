package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public abstract  class Piece {


    private Color color;
    private Position position;


    public Piece(Color color,Position position){
        this.color=color;
        this.position=position;
     }


     protected final Color getColor(){
        return color;
     }

    public final Position getPosition(){
        return position;
    }

     public void changePosition(Position pos){
        if (validatePosition(pos)){
            this.position=pos;
        }
     }


    public void addMove(ArrayList<Position> p,Position pos) {
        if (Position.validatePosition(pos)) {
            p.add(pos);
        }
    }


     public boolean equalsPosition(Position pos){
        return position.equals(pos);
     }


     public  abstract ArrayList<Position> calculateMovements();

    public  boolean validatePosition(Position p){
        boolean isValidate=false;
        ArrayList<Position> positions= calculateMovements();
        int i=0;
        while (i<positions.size() && !isValidate){
            isValidate=positions.get(i).equals(p);
            i++;
        }
        return isValidate;


    }

}
