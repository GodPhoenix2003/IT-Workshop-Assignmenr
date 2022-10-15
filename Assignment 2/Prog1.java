import java.util.*;

public class Prog1{
	public static void main(String []args){
		System.out.print("\nEnter the array size: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("\nEnter the array elements:");
		for(int  i = 0; i < n; i++)
			arr[i] = in.nextInt();
		System.out.println("\nArray Elements are:-");
		for(int  i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		in.close();
	}
}