/*

Question:-

Implementation of this keyword as local variable suppressor.

*/

public class Prog9 {
    int x = 10;
    public void display(int x){
        System.out.println("\nthis.x = " + this.x);
        System.out.println("\nx = " + x + "\n");
    }
    public static void main(String []args) {
        Prog9 obj = new Prog9();
        obj.display(5);
    }
}

/*

Output:-

this.x = 10

x = 5

*/