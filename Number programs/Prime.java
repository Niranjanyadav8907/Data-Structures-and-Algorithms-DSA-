class Prime
{
	public static void main(String[] args)
	{
		int n=1;
		if(isPrime(n))
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is NOT a Prime Number");
	}
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				//System.out.println(n+" is divided by: "+i);
				return false;
			}
		}
	return true;
	}
}



