
class Program1
{
	public static int getSum(int a, int b){
		System.out.println("This is getSum method");
		int sum=a+b;
	return sum;
	}

	public static void main(String[] args){
		int p=40;
		int q=30;
		int sum=getSum(p,q);
		System.out.println(sum+" square is: "+sum*sum);
	}
}



