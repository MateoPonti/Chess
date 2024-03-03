package model.chess;

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

    public static  Position moovePosition(Position p,int x, int y,boolean b) {
        if (b){return new Position(p.getX()+x,p.getY()+y);}
        return new Position(p.getX()-x,p.getY()-y);

    }

}
