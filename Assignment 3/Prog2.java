/*

Question:-

Write a java program to implement of constructor overloading.

*/

public class Prog2 {
    int a = 10, b = 20;
    public Prog2(){
        System.out.println("Unparameterized Constructor");
    }
    public Prog2(int a, int b){
        System.out.println("Parameterized Constructor");
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println("Sum = " + (this.a + this.b));
    }
    public static void main(String []args){
        Prog2 obj1 = new Prog2();
        obj1.add();
        Prog2 obj2 = new Prog2(30, 40);
        obj2.add();
    }
}

/*

Output:-

Unparameterized Constructor
Sum = 30
Parameterized Constructor
Sum = 70

*/