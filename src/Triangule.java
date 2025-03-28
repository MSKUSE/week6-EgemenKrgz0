public class Triangule extends Shape {


    private Point topLeft;
    private int sideA;
    private Point topRight;
    private int sideB;
    public static int counter = 0;
    public int counterForObject = 0;

    public Triangule(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideA);
        counter++;
    }




    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if(sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side cant be negative");
        }else{
            this.sideA = sideA;
        }
    }
    @Override
    public double area() {
        return (this.sideA*this.sideB)/2;
    }
    public double perimeter(){
        return sideA+sideB;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if(sideB <0){
            throw new IllegalArgumentException("Side B can't be negative");
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Location" + getLocation() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
