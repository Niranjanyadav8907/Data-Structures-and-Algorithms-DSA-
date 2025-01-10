import java.util.Scanner;
class LCM
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
		int lcm=getLCM(a,b,c);
		System.out.println("LCM of "+a+","+b+" and "+c+" is: "+lcm);
	}	
	public static int getLCM(int a,int b, int c)
	{
		int x=a>b?a:b;
		int big=x>c?x:c;
		for(int i=big;;i+=big){
			if(i%a==0 && i%b==0 && i%c==0)
				return i;
		}
	}
}