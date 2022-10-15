class Prog12{
	public static void main(String []args){
		int x = Integer.parseInt(args[0]);
		if(x % 5 == 0)
			System.out.println("\n" + x + " is divisible by 5.\n");
		else
			System.out.println("\n" + x + " is not divisible by 5.\n");
	}
}