//Write a java program to implement the inheritance in interface.

interface Sound{
    void rev();
}

class Nissan implements Sound{
    public void rev(){
        System.out.println("Peace!");
    }
}

public class prog4{
    public static void main(String []args){
        Nissan supra = new Nissan();
        supra.rev();
    }
}

/*
 * Output:-
 * Peace!
 */