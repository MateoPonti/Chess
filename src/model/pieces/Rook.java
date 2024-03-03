package model.pieces;

import model.Board.Board;
import model.chess.Color;
import model.chess.Position;

import java.util.ArrayList;

public class Rook extends Piece {


    public Rook(Color c, Position p){
        super(c,p);
    }

    @Override
    public ArrayList<Position> calculateMovements() {
        ArrayList<Position> positions= new ArrayList<>();
        Position p=getPosition();
        int size = Board.getSize();

        for (int i = 1 ; i<=size-p.getY();i++){
            addMove(   positions, (Position.moovePosition(p,0,i,true)));
        }

        for (int i = 1 ; i<=p.getY();i++){
            addMove(   positions, (Position.moovePosition(p,0,i,false)));

        }

        for (int i = 1 ; i<=size-p.getX();i++){
            addMove(   positions, (Position.moovePosition(p,i,0,true)));
        }

        for (int i = 1 ; i<=p.getX();i++){
            addMove(   positions, (Position.moovePosition(p,i,0,false)));
        }

        return positions;

    }

}
