import java.util.Scanner;
class Triangle4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i+j>=n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}	
}



