import java.util.*;
public class Prog2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the number of rows: ");
        int r = in.nextInt();
        System.out.print("\nEnter the number of columns: ");
        int c = in.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("\nEnter the 2D array elements:");
        for(int  i = 0; i < r; i++){
            for(int j = 0; j < c ; j++)
                arr[i][j] = in.nextInt();
        }
        System.out.println("\n2D array elements are:");
        for(int  i = 0; i < r; i++){
            for(int j = 0; j < c ; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        in.close();
    }
}