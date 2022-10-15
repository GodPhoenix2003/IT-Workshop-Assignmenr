//Write a java program to implement super() method without parameter.

class x{
    public x(){
        System.out.println("Super Class");
    }
}

public class prog7 extends x{
    String a;
    public prog7(){
        super();
        System.out.println("Child Class");
    }
    public static void main(String []args){
        new prog7();
    }
}

/*
 * Output:-
 * Super Class
 * Child Class
 */