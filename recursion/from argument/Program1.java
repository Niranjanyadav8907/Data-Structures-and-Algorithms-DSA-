class Program1
{
	public static void main(String[] args)
	{
		int p=12;	int q=23;
		int r=30;	int s=45;	int x=50;
		int sum=getSum(getSum(getSum(p,q), r), getSum(s,x));
		System.out.println("Total Sum is: "+sum);
	}
	public static int getSum(int a, int b){
	return a+b;
	}	
}



