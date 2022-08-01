public class Square extends Rectangle{
    private double side=1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double length, double width, double side) {
        super(length, width);
        this.side = side;
    }

    public Square(String color, boolean fill, double length, double width, double side) {
        super(color, fill, length, width);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
