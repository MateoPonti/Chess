package model.pieces;

import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Queen extends Piece{

    public Queen(Color c){
        super(c);
    }
    @Override
    public ArrayList<Position> calculateMovements(Position pos) {
        Rook r = new Rook(getColor());
        Bishop b= new Bishop(getColor());;
        ArrayList<Position> p= r.calculateMovements(pos);
        p.addAll(b.calculateMovements(pos));
        return p;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
