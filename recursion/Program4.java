import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		printNumber(n);	
	}
	public static void printNumber(int n){
		if(n>0){
			System.out.println(n);
			printNumber(n-1);
		}
	}	
}



