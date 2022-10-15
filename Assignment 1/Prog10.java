class Prog10{
	public static void main(String []args){
		int year = Integer.parseInt(args[0]);
		if(year % 4 == 0)
			System.out.println("\n" + year + " is a Leap year.\n");
		else
			System.out.println("\n" + year + " is a not Leap year.\n");
	}
}