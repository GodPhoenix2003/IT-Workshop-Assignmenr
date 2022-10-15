class Prog3{
	public static void main(String []args){
		int x = 5, facto = 1;
		for(int i = 1; i <= x; i++)
			facto *= i;
		System.out.println("\nFactorial of " + x + " = " + facto + "\n");
	}
}