//Write a java program to implement multiple inheritance with the help of interface.

interface Sound{
    void rev();
}

interface Drive{
    void drift();
}

class Nissan implements Sound, Drive{
    public void rev(){
        System.out.println("Peace!");
    }
    public void drift(){
        System.out.println("Weee!");
    }
}

public class prog3{
    public static void main(String []args){
        Nissan supra = new Nissan();
        supra.rev();
        supra.drift();
    }
}

/*
 * Output:-
 * Peace!
 * Weee!
 */