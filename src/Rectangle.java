public class Rectangle extends Shape {


    private Point topLeft;
    private int sideA, sideB;

    public static int counter = 0;
    public int counterForObject = 0;

    public Rectangle(Point topLeft, int sideA, int sideB) {
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
        return this.sideA*this.sideB;
    }
    public double perimeter(){
        return 2*sideA + 2*sideB;
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
