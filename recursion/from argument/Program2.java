import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		int x=sc.nextInt();
		System.out.println("ENter the 2nd Number: ");
		int y=sc.nextInt();
		System.out.println("ENter the 3rd Number: ");
		int z=sc.nextInt();
		System.out.println("ENter the 4th Number: ");
		int p=sc.nextInt();
		System.out.println("ENter the 5th Number: ");
		int q=sc.nextInt();
		int big=getBig(getBig(getBig(x,y),z), getBig(p,q));
		System.out.println("Biggest is: "+big);
	}
	public static int getBig(int a, int b){
	return a>b?a:b;
	}	
}



