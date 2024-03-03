package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Queen extends Piece{

    public Queen(Color c, Position p){
        super(c,p);
    }
    @Override
    public ArrayList<Position> calculateMovements() {
        Rook r = new Rook(getColor(),getPosition());
        Bishop b= new Bishop(getColor(),getPosition());;
        ArrayList<Position> p= r.calculateMovements();
        p.addAll(b.calculateMovements());
        return p;
    }
}
