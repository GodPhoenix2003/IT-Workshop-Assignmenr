class Prog5{
	public static void main(String []args){
		int x = 5;
		Factorial obj = new Factorial();
		System.out.println("\nFactorial of " + x + " = " + obj.facto(x) + "\n");
	}
}

class Factorial{
	public int facto(int n){
		if(n == 1)
			return(1);
		else
			return(n * facto(n-1));
	}
}