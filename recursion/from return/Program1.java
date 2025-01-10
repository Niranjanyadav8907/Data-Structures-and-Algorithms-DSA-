
class Program1
{
	public static void main(String[] args)
	{
		printNum(1);
	}
	public static int printNum(int n){
		System.out.println("n is: "+n);
	return printNum(n+1);
	}	
}



