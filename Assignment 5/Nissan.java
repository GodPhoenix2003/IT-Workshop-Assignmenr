//Q1
//Write a java program to implement the abstraction property.

abstract class GTR{
    abstract void rev();
}

class Nissan extends GTR{
    void rev(){
        System.out.println("Peace!");
    }
    public static void main(String []args){
        GTR car = new Nissan();
        car.rev();
    }
}

/*
 * Output:-
 * Peace!
 */