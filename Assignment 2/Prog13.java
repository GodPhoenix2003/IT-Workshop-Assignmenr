import java.util.*;
public class Prog13 {
    public int bin_deci(int b){
        int d = 0, n = 0;
        while(b > 0){
            int tmp = b % 10;
            d += tmp * (Math.pow(2, n));
            b /= 10;
            n++;
        }
        return(d);
    }
    public int deci_bin(int d){
        int b = 0;
        while(d > 0){
            b = (b * 10) + (d % 2);
            d /= 2;
        }
        return(b);
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose one option:-");
        System.out.println("1. Binary -> Decimal");
        System.out.println("2. Decimal -> Binary");
        int x = 1;
        while(x ==1){
            System.out.print("Enter your choice: ");
            int opt = in.nextInt();
            Prog13 obj = new Prog13();
            if(opt == 1){
                System.out.print("Enter the binary number: ");
                int bin = in.nextInt();
                System.out.println(bin + " -> " + obj.bin_deci(bin));
            }
            else{
                System.out.print("Enter the decimal number: ");
                int deci = in.nextInt();
                System.out.println(deci + " -> " + obj.deci_bin(deci));
            }
            System.out.print("Do you wanna run the prgram again?(yes-1/no-0): ");
            x = in.nextInt();
        }
        in.close();
    }
}