public class Prog4 {
    int x, y;
    public Prog4(){
        this.x = 5;
        this.y = 6;
    }
    public int summation(){
        return(this.x + this.y);
    }
    public static void main(String []args){
        Prog4 obj = new Prog4();
        System.out.println("Sum = " + obj.summation());
    }
}