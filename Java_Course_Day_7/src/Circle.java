public class Circle extends Shape{
    private double radius=1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle( ) {

    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
