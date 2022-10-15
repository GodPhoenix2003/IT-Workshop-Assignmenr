public class Prog4 extends Hola {
    public static void main(String []args){
        hola();
        new Prog44().prog44();
    }
}

class Prog44 extends Hola {
    public void prog44(){
        hola();
    }
}

class Hola {
    static int x = 0;
    public static void hola(){
        System.out.println("Child " + (++x));
    }
}
