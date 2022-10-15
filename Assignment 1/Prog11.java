class Prog11{
	public static void main(String []args){
		float percentage = Float.parseFloat(args[0]);
		if(percentage >= 90)
			System.out.println("\nThe student have been rewarded Grade A for scorring " + percentage + "% of marks.\n");
		else if(percentage >= 80)
			System.out.println("\nThe student have been rewarded Grade B for scorring " + percentage + "% of marks.\n");
		else if(percentage >= 70)
			System.out.println("\nThe student have been rewarded Grade C for scorring " + percentage + "% of marks.\n");
		else if(percentage >= 60)
			System.out.println("\nThe student have been rewarded Grade D for scorring " + percentage + "% of marks.\n");
		else if(percentage >= 40)
			System.out.println("\nThe student have been rewarded Grade E for scorring " + percentage + "% of marks.\n");
		else
			System.out.println("\nThe student have been rewarded Grade F for scorring " + percentage + "% of marks.\n");
	}
}