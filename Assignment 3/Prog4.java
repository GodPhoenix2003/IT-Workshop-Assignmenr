/*

Question:-

Implementation of this keyword to invoke current class constructor.

*/

public class Prog4 {
    public Prog4(){
        System.out.println("\nHola");
    }
    public Prog4(int x){
        this();
        System.out.println("\nx = " + x + "\n");
    }
    public static  void main(String []args){
        new Prog4(10);
    }
}

/*

Output:-

Hola

x = 10

*/