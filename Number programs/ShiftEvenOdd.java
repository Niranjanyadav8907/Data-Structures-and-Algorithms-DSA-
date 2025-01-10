import java.util.Scanner;
class ShiftEvenOdd
{
	public static void main(String[] args)
	{
		int n=3564727;
		System.out.println("The Number is: "+n);
		String result=getResult(n);
		System.out.println("The Result is: "+result);
	}
	public static String getResult(int n){
		String result="";
		while(n>0){
			int rem=n%10;
			if(rem%2==0)
				result=rem+result;
			else
				result=result+rem;
		n=n/10;
		}
	return result;
	}	
}



