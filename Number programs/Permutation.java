import java.util.*;
class Permutation
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		System.out.println("ENter r: ");
		int r=sc.nextInt();
		String per=getPermutation(n,r);
		System.out.println(per);	
	}
	public static String getPermutation(int n, int r){
		if(r>n)
			return "This Arrangements are not Possible";
		int per=1;
		for(int i=0;i<r;i++){
			per=per*(n-i);
		}
	return "Total ways of arrangements are: "+per;
	}
}



