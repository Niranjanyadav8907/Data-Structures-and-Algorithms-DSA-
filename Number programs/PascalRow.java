import java.util.Scanner;
class PascalRow
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row: ");
		int n=sc.nextInt();
		getRow(n);
	}
	public static void getRow(int n){
	
		for(int i=0;i<n;i++){	
			int comb=1;
			for(int j=0;j<i;j++){
				comb=comb*(n-1-j)/(j+1);
			}
			System.out.print(comb+"  ");
		}
	}
}



