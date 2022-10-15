import java.util.*;
public class Prog10 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int x = in.nextInt();
        int rev = 0, dup = x;
        while(dup > 0){
            rev = (rev * 10) + (dup % 10);
            dup /= 10;
        }
        System.out.println("Reversed number of " + x +" : " + rev);
        in.close();
    }
}