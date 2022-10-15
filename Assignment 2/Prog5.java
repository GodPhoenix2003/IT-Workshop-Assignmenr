public class Prog5 {
    int x, y;
    public Prog5(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int summation(){
        return(this.x + this.y);
    }
    public static void main(String []args){
        int x = 5, y = 6;
        Prog5 obj = new Prog5(x, y);
        System.out.println("Sum = " + obj.summation());
    }
}