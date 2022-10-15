/*

Question:-

Implementation of this keyword to invoke current class method.

*/

public class Prog3 {
    public void hola(){
        System.out.println("Hola\n");
    }
    public void hi(){
        System.out.println("\nHi\n");
        this.hola();
    }
    public static void main(String []args){
        Prog3 obj = new Prog3();
        obj.hi();
    }
}

/*
Output:-

Hi

Hola

*/