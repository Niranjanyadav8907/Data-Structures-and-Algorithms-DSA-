import java.util.Scanner;
class PascalTriangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row: ");
		int n=sc.nextInt();
		getPascalTriangle(n);
	}
	public static void getPascalTriangle(int n){
		int space=n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			getRow(i);
			space--;
		System.out.println();
		}
	}

	public static void getRow(int n){
		for(int i=0;i<n;i++){	
			int comb=1;
			for(int j=0;j<i;j++){
				comb=comb*(n-1-j)/(j+1);
			}
			System.out.print(comb+" ");
		}
	}
}




