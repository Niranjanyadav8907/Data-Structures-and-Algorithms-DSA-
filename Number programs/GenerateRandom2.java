import java.util.Scanner;
class GenerateRandom2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the starting point: ");
		int min=sc.nextInt();
		System.out.println("ENter the end point: ");
		int max=sc.nextInt();

		int r1=min+(int)(Math.random()*(max-min));
		System.out.println("Random number is: "+r1);
	}
}



