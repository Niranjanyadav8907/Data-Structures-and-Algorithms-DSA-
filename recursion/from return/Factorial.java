
class Factorial
{
	public static void main(String[] args)
	{
		int n=6;
		int fact=getFactorial(n);
		System.out.println(n+"!= "+fact);
	}
	public static int getFactorial(int n){
		if(n>1){
			return n*getFactorial(n-1);
		}
		else
			return n;
	}	
}



