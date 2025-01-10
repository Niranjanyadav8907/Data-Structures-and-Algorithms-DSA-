
class Program1
{
	static int count=0;
	public static void main(String[] args)
	{
		test();	
	}
	public static void test(){
		count++;
		System.out.println("This is Test method execution "+count);
		test();
	}	
}



