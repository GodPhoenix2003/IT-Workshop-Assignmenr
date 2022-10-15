public class Prog5 extends Hola {
    public static void main(String []args){
        hola();
        holaa();
    }
}

class Hola extends Holaa{
    public static void hola(){
        System.out.println("Calling the Parent Class");
    }
}

class Holaa{
    public static void holaa(){
        System.out.println("Calling the Grand Parent Class: Hiararchical Inheritance Sucessful");
    }
}
