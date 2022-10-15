//Imp  note: base class reference can hold the object of child class but vice versa is not true


public class Prog8 {
    public static void main(String []args){
        Hola x;
        x = new Hola();
        x.hi();
        x = new Holaa();
        x.hi();
    }
}

class Hola{
    public void hi(){
        System.out.println("Hola: Hi");
    }
}

class Holaa extends Hola{
    public void hi(){
        System.out.println("Holaa: Hi");
    }
}
