package Game;

import model.chess.Color;
import model.chess.Position;
import model.pieces.Pawn;
import model.pieces.Rook;

import java.util.ArrayList;

public class Chess {
    public static void main(String[] args) {
        Rook rook  =new Rook(Color.WHITE,new Position(0,0));
        System.out.println(rook.getPosition().getX()+ " "+  rook.getPosition().getY());
        ArrayList<Position> pos= rook.calculateMovements();
        for (Position p :pos){
            System.out.println(p.getX()+" "+p.getY());
        }
        System.out.println();
        rook.changePosition(pos.get(1));
        System.out.println(rook.getPosition().getX()+ " "+  rook.getPosition().getY());
        pos= rook.calculateMovements();
        for (Position p :pos){
            System.out.println(p.getX()+" "+p.getY());
        }


        System.out.println();
        rook.changePosition(pos.get(pos.size()-1));
        System.out.println(rook.getPosition().getX()+ " "+  rook.getPosition().getY());
        pos= rook.calculateMovements();
        for (Position p :pos){
            System.out.println(p.getX()+" "+p.getY());
        }
    }
}
