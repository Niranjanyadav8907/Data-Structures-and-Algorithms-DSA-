
class Program2
{
	public static void main(String[] args)
	{
		printNum(1);
	}
	public static int printNum(int n){
		if(n<=3){
			System.out.println("n from if is: "+n);
			return printNum(n+1);
		}
		else{
			System.out.println("n from else is: "+n);
		return n;
		}
		
	}	
}



