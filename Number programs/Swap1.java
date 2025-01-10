class Swap1
{
	public static void main(String[] args)
	{
		int a=48;
		int b=230;
		System.out.println("a before swapping is: "+a);
		System.out.println("b before swapping is: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("========================");
		System.out.println("a after swapping is: "+a);
		System.out.println("b after swapping is: "+b);
	}
}



