package Game;

import model.chess.Color;
import model.chess.Position;
import model.pieces.Bishop;
import model.pieces.Horse;
import model.pieces.Queen;

import java.util.ArrayList;

public class Chess {
    public static void main(String[] args) {
        Queen piec  =new Queen(Color.WHITE,new Position(4,4));
        System.out.println(piec.getPosition().getY()+ " "+  piec.getPosition().getX());
        ArrayList<Position> pos= piec.calculateMovements();
        for (Position p :pos){
            System.out.println("y: "+p.getY()+" x: "+p.getX());
        }
        System.out.println();
    }

}
