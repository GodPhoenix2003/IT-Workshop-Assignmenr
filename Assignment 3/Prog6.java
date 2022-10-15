/*

Question:-

Implementation of this keyword to pass as argument in the constructor call.

*/

public class Prog6 {
    int data = 5;
    public Prog6() {
        Demo d = new Demo(this);
        d.display(); 
    }
    public static void main(String []args) {
        new Prog6();
    }
}

class Demo {
    Prog6 obj;
    public Demo(Prog6 obj) {
        this.obj = obj;
    }
    public void display(){
        System.out.println("\n" + obj.data + "\n");
    }
}

/*

Output:-

5

*/