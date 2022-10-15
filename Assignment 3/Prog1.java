/*

Question:-

Implementation of method overloading with respect to parameter number, parameter data type.

*/

public class Prog1{
    public static void main(String []args){
        Prog1 obj = new Prog1();
        System.out.println("Sum = " + obj.add(1.0, 2));
    }
    public double add(double a, int b){
        System.out.println("Double Int Version");
        return(a + b);
    }
    public double add(int a, double b){
        System.out.println("Int Double Version");
        return(a + b);
    }
    public int add(int a, int b, int c){
        System.out.println("3 Inputs");
        return(a + b + c);
    }
}

/*

Output:-

Double Int Version
Sum = 3.0

*/