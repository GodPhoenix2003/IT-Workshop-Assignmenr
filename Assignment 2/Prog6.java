public class Prog6 {
    int x, y;
    public Prog6(){
        this.x = 5;
        this.y = 6;
    }
    public int summation(){
        return(this.x + this.y);
    }
    public static void main(String []args){
        Prog6 obj = new Prog6();
        System.out.println("Sum = " + obj.summation());
    }
}