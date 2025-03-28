public class Point {
    public int xCoord, yCoord;
    public Point(){

    }
    public Point(int x,int y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point(int x) {
        this.xCoord = x;
        this.yCoord=x;

    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }
}
