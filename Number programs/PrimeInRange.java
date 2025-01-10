class PrimeInRange
{
	public static void main(String[] args)
	{
		int start=130;	int end=250;
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Prime numbers in given range are: "+count);
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



