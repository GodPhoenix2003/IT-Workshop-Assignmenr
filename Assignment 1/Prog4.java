class Prog4{
	public int factorial(int n){
		if(n == 1)
			return(1);
		else
			return(n * factorial(n-1));
	}
	public static void main(String []args){
		int x = 5;
		Prog4 obj = new Prog4();
		System.out.println("\nFactorial of " + x + " = " + obj.factorial(x) + "\n");
	}
}