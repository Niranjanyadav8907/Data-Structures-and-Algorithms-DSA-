
class Program3
{
	public static void main(String[] args)
	{
		System.out.println("From main: "+printNum(1));
	}
	public static int printNum(int n){
		if(n<=3){
			System.out.println("n from if is: "+n);
			return printNum(n+1);
		}
	System.out.println("n from else is: "+n);
	return n;
	}	
}



