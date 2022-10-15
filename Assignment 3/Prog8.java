/*

Question:-

Prove that this keyword refers to the current class instance variable.

*/

public class Prog8 {
    public void display(){
        System.out.println("\nthis = " + this + "\n");
    }
    public static void main(String []args){
        System.out.println("\nobj = " + new Prog8() + "\n");
        new Prog8().display();
    }
}

/*

Output:-

obj = Prog8@41629346


this = Prog8@41629346

*/