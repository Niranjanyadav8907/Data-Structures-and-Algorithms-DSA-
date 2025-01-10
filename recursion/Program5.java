import java.util.Scanner;
class Program5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		printNumber(n);	
	}
	public static void printNumber(int n){
		if(n>1){
			printNumber(n-1);
		}
		System.out.println(n);
	}	
}



