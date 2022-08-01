import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Circle c1=new Circle("red",false,5);
        System.out.println("Area for circle: "+c1.getArea());
        System.out.println("Perimeter for circle: "+c1.getPerimeter());
        System.out.println("Circle tostring: "+c1.toString());

        Rectangle r1=new Rectangle("green",true,2,4);
        System.out.println("Area for rectangle: "+r1.getArea());
        System.out.println("Perimeter for rectangle"+r1.getPerimeter());
        System.out.println("rectangle tostring: "+r1.toString());


        Square s1=new Square("blue",true,2,2,4);
        System.out.println("Area for Square: "+s1.getArea());
        System.out.println("Perimeter for square"+s1.getPerimeter());
        System.out.println("square tostring: "+s1.toString());
    }
}