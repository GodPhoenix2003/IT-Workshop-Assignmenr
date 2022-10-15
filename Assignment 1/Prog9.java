class Prog9{
	public static void main(String []args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("\nBefore Swapping:-\nx = " + x + "\ty = " + y + "\n");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("\nAfter Swapping:-\nx = " + x + "\ty = " + y + "\n");
	}
}