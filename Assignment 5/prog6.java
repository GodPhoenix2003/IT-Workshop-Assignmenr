//Write a java program to implement super keyword in java.

class Nissan{
    String car = "supra";
}

class Supra extends Nissan{
    String car = "rev";
    void print(){
        System.out.println("Peace: " + car);
        System.out.println("Legend: " + super.car);
    }
}

public class prog6{
    public static void main(String []args){
        Supra supra = new Supra();
        supra.print();
    }
}

/*
 * Output:-
 * Peace: rev
 * Legend: supra
 */