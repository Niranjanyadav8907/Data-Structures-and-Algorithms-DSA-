import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		String binary=getBinaryFromDecimal(n);
		System.out.println("Binary value of "+n+" is: "+binary);
	}	
	public static String getBinaryFromDecimal(int n)
	{
		String bin="";
		while(n>0){
			int rem=n%2;
			bin=rem+bin;
		n=n/2;
		}
	return bin;
	}
}