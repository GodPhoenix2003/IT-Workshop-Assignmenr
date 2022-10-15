/*

Question:-

Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it.
The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ).
Override these two methods in each of the derived classes to calculate the volume and whole surface area of each type of three-dimensional objects.
The dimensions of the objects are to be taken from the users and passed through the respective constructors of each derived class.
Write a main method to test these classes.

*/

import java.util.*;
public class Prog10 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the length, breadth and height of the box :");
        double l = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
        Box box = new Box(l, b, h);
        box.area();
        box.volume();
        System.out.println("\nEnter the side length of the cube :");
        double s = in.nextDouble();
        Cube cube = new Cube(s);
        cube.area();
        cube.volume();
        System.out.println("\nEnter the radius and height of the cylinder :");
        double r = in.nextDouble();
		h = in.nextDouble();
        Cylinder cylinder = new Cylinder(r, h);
        cylinder.area();
        cylinder.volume();
        System.out.println("\nEnter the radius and height of the cone :");
        r = in.nextDouble();
		h = in.nextDouble();
        Cone cone = new Cone(r, h);
        cone.area();
        cone.volume();
        in.close();
    }
}

class ThreeDObject {
    double pi = 3.141592654;
    public double wholeSurfaceArea(double l, double b, double h){
        return(2 * ((l * b) + (b * h) + (h * l)));
    }
    public double wholeSurfaceArea(double s){
        return(6 * s * s);
    }
    public double wholeSurfaceArea(double r, double h, int x){
        return((2 * pi * r * h));
    }
    public double wholeSurfaceArea(double r, double h){
        return((pi * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)))));
    }
    public double volume(double l, double b, double h){
        return(l * b * h);
    }
    public double volume(double s){
        return(Math.pow(s, 3));
    }
    public double volume(double r, double h, int x){
        return(pi * Math.pow(r, 2) * h);
    }
    public double volume(double r, double h){
        return(pi * Math.pow(r, 2) * h / 3);
    }
}

class Box{
    ThreeDObject obj = new ThreeDObject();
    double L, B, H;
    public Box(double L, double B, double H){
        this.L = L;
        this.B = B;
        this.H = H;
    }
    public void area(){
        System.out.println("Total surface area of the Box is: " + obj.wholeSurfaceArea(L, B, H));
    }
    public void volume(){
        System.out.println("Total volume of the Box is: " + obj.volume(L, B, H));
    }
}

class Cube{
    ThreeDObject obj = new ThreeDObject();
    double S;
    public Cube(double S){
        this.S = S;
    }
    public void area(){        
        System.out.println("Total surface area of the Cube is: " + obj.wholeSurfaceArea(S));
    }
    public void volume(){
        System.out.println("Total volume of the Cube is: " + obj.volume(S));
    }
}

class Cylinder{
    ThreeDObject obj = new ThreeDObject();
    double R, H;
    public Cylinder(double R, double H){
        this.R = R;
		this.H = H;
    }
    public void area(){
        System.out.println("Total surface area of the Cylinder is: " + obj.wholeSurfaceArea(R, H, 1));
    }
    public void volume(){
        System.out.println("Total volumne of the Cylinder is: " + obj.volume(R, H, 1));
    }
}

class Cone{
    ThreeDObject obj = new ThreeDObject();
    double R, H;
    public Cone(double R, double H){
        this.R = R;
		this.H = H;
    }
    public void area(){
        System.out.println("Total surface area of the Cone is: " + obj.wholeSurfaceArea(R, H));
    }
    public void volume(){
        System.out.println("Total volumne of the Cone is: " + obj.volume(R, H));
    }
}

/*

Output:-

Enter the length, breadth and height of the box :
10.1
15.2
20.3
Total surface area of the Box is: 1334.22
Total volume of the Box is: 3116.4559999999997

Enter the side length of the cube :
10.1
Total surface area of the Cube is: 612.06
Total volume of the Cube is: 1030.301

Enter the radius and height of the cylinder :
10.1
15.2
Total surface area of the Cylinder is: 964.59460848416
Total volumne of the Cylinder is: 4871.2027728450075

Enter the radius and height of the cone :
10.1
15.2
Total surface area of the Cone is: 899.5370660133905
Total volumne of the Cone is: 1623.7342576150024

*/