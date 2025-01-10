class Shift0andOther
{
	public static void main(String[] args)
	{
		int n=35047070;
		System.out.println("The Number is: "+n);
		String result=getResult(n);
		System.out.println("The Result is: "+result);
	}
	public static String getResult(int n){
		String zero="";	String other="";
		while(n>0){
			int rem=n%10;
			if(rem==0)
				zero=rem+zero;
			else
				other=rem+other;
		n=n/10;
		}
	return zero+other;
	}	
}



