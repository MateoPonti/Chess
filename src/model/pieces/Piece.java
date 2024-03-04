package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public abstract  class Piece {


    private Color color;
    private Position position;


    public Piece(Color color){
        this.color=color;
     }


     protected final Color getColor(){
        return color;
     }





    public void addMove(ArrayList<Position> p,Position pos) {
        if (Position.validatePosition(pos)) {
            p.add(pos);
        }
    }


     public boolean equalsPosition(Position pos){
        return position.equals(pos);
     }


     public  abstract ArrayList<Position> calculateMovements(Position pos);



}
