//Q2
//Write a java program to implement interface.

interface peace{
    void rev();
}

class BMW implements peace{
    public void rev(){
        System.out.println("Rutututututu!!!");
    }
    public static void main(String []args){
        BMW BMWSeries8 = new BMW();
        BMWSeries8.rev();
    }
}

/*
 * Output:-
 * Rutututututu!!!
 */