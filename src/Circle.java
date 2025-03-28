public class Circle extends Shape{

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI* radius*radius;
    }
    @Override
    public double perimeter(){
        return 2*sideA + 2*sideB;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Location" + getLocation() +
                ", radius=" + radius +
                '}';
    }
}

