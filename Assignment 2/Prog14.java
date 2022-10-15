import java.util.*;
public class Prog14 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int x = in.nextInt();
        int dup = x, n = 0, sum = 0;
        while(dup > 0){
            n++;
            dup /= 10;
        }
        dup = x;
        for(int  i = 1; i <= n; i++){
            sum += Math.pow((dup % 10), n);
            dup /= 10;
        }
        if(x == sum)
            System.out.println(x + " is an Armstrong number.");
        else
            System.out.println(x + " is not an Armstrong number.");
        in.close();
    }
}