class Sum
{
	public static void main(String[] args)
	{
		int x=34;
		int y=55;
		int sum=getSum(x,y);
		System.out.print("sum of "+x+" and "+y+" is: "+sum);
	}
	public static int getSum(int a, int b){
		while(b!=0){
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
	return a;
	}	
}



