class PrimeInRangeTCS
{
	public static void main(String[] args)
	{
		int start=100;	int end=200;
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i) && isPrime(getSum(i))){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal such Prime numbers are: "+count);
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
	public static int getSum(int n){
		int sum=0;
		while(n>0){
			sum=sum+n%10;
		n=n/10;
		}
	return sum;
	}
}










