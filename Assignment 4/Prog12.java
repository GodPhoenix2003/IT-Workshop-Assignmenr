public class Prog12 {
    public static void main(String []args){
        System.out.println("Fraction 1:-");
        new Fraction(10, 12).display();
        System.out.println("Fraction 2:-");
        new Fraction(10, 12.345).display();
        System.out.println("Fraction 3:-");
        new Fraction(10.658, 12.345).display();
    }
}

class Fraction{
    double n, d;
    public Fraction(int n, int d){
        this.n = n;
        this.d = d;
    }
    public Fraction(int n, double d){
        this.n = n;
        this.d = d;
    }
    public Fraction(double n, double d){
        this.n = n;
        this.d = d;
    }
    public void display(){
        double frac = this.n/this.d;
        System.out.println("Fraction = " + frac);
    }
}
