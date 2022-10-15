import java.util.*;
public class Prog12 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int x = in.nextInt();
        int flag = 1;
        if(x < 10){
            if(x == 2 || x == 3 || x == 5 || x == 7)
                System.out.println(x + " is a Prime number.");
            else
                System.out.println(x + " is not a Prime number.");
        }
        else{
            for(int  i = 2; i <= (x / 2); i++){
                if(x % i == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.println(x + " is a Prime number.");
            else
                System.out.println(x + " is not a Prime number.");
        }
        in.close();
    }
}