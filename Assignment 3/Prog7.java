/*

Question:-

Implement - this keyword can be used to return current class instance.

*/

public class Prog7 {
    public static void main(String []args) {
        new Demo().classinstancereturn().display();
    }
}

class Demo {
    public Demo classinstancereturn(){
        return(this);
    }
    public void display(){
        System.out.println("\nHola\n");
    }
}

/*

Output:-

Hola

*/