import java.util.Scanner;
class GCD
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter the 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("ENter the 3rd Number: ");
		int c=sc.nextInt();
		int gcd=getGCD(a,b,c);
		System.out.println("GCD of "+a+","+b+" and "+c+" is: "+gcd);
	}	
	public static int getGCD(int a,int b, int c)
	{
		int x=a<b?a:b;
		int small=x<c?x:c;
		for(int i=small;;i--){
			if(a%i==0 && b%i==0 && c%i==0)
				return i;
		}
	}
}