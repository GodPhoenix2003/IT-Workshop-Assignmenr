public class Prog9 {
    public static void main(String []args){
        Hola x = new Holaa();
        x.hi();
    }
}

class Hola{
    public static void hi(){
        System.out.println("Hola: Hi");
    }
}

class Holaa extends Hola{
    public static void hi(){
        System.out.println("Holaa: Hi");
    }
}
