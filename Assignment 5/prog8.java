//Write a java program to implement super() method with parameter.

class x{
    public x(int a){ 
        System.out.println("Super Class: " + a);
    }
}

public class prog8 extends x{
    public prog8(int a, int b){
        super(b);
        System.out.println("Child Class: " + a);
    }
    public static void main(String []args){
        new prog8(1, 2);
    }
}

/*
 * Output:-
 * Super Class: 2
 * Child Class: 1
 */