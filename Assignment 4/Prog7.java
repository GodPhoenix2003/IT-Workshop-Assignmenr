public class Prog7 extends Hola {
    public static void hola(){
        System.out.println("Child Class");
    }
    public static void main(String []args){
        hola();
    }
}

class Hola {
    public static void hola(){
        System.out.println("Parent Class");
    }
}
