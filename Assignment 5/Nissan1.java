//Implementation of final keyword before a variable.

public class Nissan1{
    final int speed = 400;
    void drift(){
        speed = 380;
    }
    public static void main(String []args){
        Nissan1 supra = new Nissan1();
        supra.drift();
    }
}

/*
 * Output:-
 * Compile time error
 */