class Prog6{
	public static void main(String []args){
		int x = Integer.parseInt(args[0]);
		int facto = 1;
		for(int i = 1; i <= x; i++)
			facto *= i;
		System.out.println("\nFactorial of " + x + " = " + facto + "\n");
	}
}