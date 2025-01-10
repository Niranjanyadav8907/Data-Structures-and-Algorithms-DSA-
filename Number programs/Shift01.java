import java.util.Scanner;
class Shift01
{
	public static void main(String[] args)
	{
		int n=10011011;
		System.out.println("The Number is: "+n);
		String result=getResult(n);
		System.out.println("The Result is: "+result);
	}
	public static String getResult(int n){
		String result="";
		while(n>0){
			int rem=n%10;
			if(rem==0)
				result=rem+result;
			else
				result=result+rem;
		n=n/10;
		}
	return result;
	}	
}



