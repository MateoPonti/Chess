package model.chess;

import model.Board.Board;

public class Position {
    private int x;
    private int y;



    public Position(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Position p) {
        return (p.getX()==getX()  && p.getY()==getY());
    }


    public static  boolean validatePosition(Position p){
        return  (p!=null && p.getX()>=0 && p.getX()<= Board.getSize() && p.getY()>=0 && p.getY()<Board.getSize());
    }
    public static  Position moovePosition(Position p,int x, int y,boolean b) {
        Position pos;
        if (b){ pos=new Position(p.getX()+x,p.getY()+y);}
        else { pos=new Position(p.getX()-x,p.getY()-y);}
        if (validatePosition(pos)){return pos;}
        return null;

    }

}
