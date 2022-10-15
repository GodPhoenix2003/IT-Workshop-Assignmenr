import java.util.*;
public class Prog11 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int x = in.nextInt();
        int rev = 0, dup = x;
        while(dup > 0){
            rev = (rev * 10) + (dup % 10);
            dup /= 10;
        }
        if(x == rev)
            System.out.println(x + " is a Palindrome Number.");
        else
            System.out.println(x + " is not a Palindrome Number.");
        in.close();
    }
}