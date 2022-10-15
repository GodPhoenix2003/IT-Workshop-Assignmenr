import java.util.*;
public class Prog10 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Assumption: The center of the circle is at the origin.");
        System.out.println("Enter the x and y coordinates of the furthest point of the circle from its center:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println("Area of the circle: " + new Circle()._area_(x, y));
        in.close();
    }
}

class Point{
    double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

class Circle{
    public double _area_(double X, double Y){
        double area, r, pi = 3.141592654;
        Point p = new Point(X, Y);
        r = Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
        area = pi * Math.pow(r, 2);
        return(area);
    }
}
