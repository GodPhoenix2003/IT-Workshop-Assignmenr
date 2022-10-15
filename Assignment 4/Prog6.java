public class Prog6 extends Hola extends Holaa {
    public static void main(String []args){
        hola();
        holaa();
    }
}

class Hola{
    public static void hola(){
        System.out.println("Parent Class 1");
    }
}

class Holaa{
    public static void holaa(){
        System.out.println("Parent Class 2");
    }
}
