import java.util.Scanner;
class BigPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Row: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int mid=n/2+1;	int space=n/2;	int m_star=n+2;	int me_star=2*n-1;
		int e_star=2*n+mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=mid;j++){//section1
				if(j<=space)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			for(int j=mid+1;j<=n+1;j++){//section2
				if(i==1 || i<=mid && j==n+1)
					System.out.print("@ ");
				else
					System.out.print("  ");	
			}
			for(int j=n+2; j<=2*n-1;j++){//section3
				if(i<=mid ||j<m_star ||j>me_star)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			for(int j=2*n; j<=5*n/2;j++){//section4
				if(i==1 ||j==2*n && i<=mid)
					System.out.print("@ ");
				else
					System.out.print("  ");
			}		
			for(int j=2*n+mid; j<=3*n;j++){//section5
				if(j<=e_star)
					System.out.print("* ");
				else
					System.out.print("  ");
			}		
		if(i<mid){
			space--;	e_star++;
		}else{
			space++;	e_star--;
		}
		if(i>mid){
			m_star++;	me_star--;
		}
		System.out.println();
		}
	}	
}



