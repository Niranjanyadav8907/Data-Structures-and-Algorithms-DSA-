class Program9
{
	public static void main(String[] args)
	{
		int n=-1;
		String bin="";
		while(n!=0){
			bin=(n&1)+bin;
		n=n>>>1;
		}
		System.out.print("Binary value is: "+bin);
	}	
}



