import java.util.*;
public class Prog3 {
    public static void main(String []args){
        System.out.print("\nEnter the array size: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("\nEnter the array elements:");
		for(int  i = 0; i < n; i++)
			arr[i] = in.nextInt();
		int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        System.out.println("\nSum of the even numbers in the array: " + sum);
		in.close();
    }
}