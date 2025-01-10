class PrimePalindrome
{
	public static void main(String[] args)
	{
		int start=200;	int end=500;
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i) && isPalindrome(i)){
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
	public static boolean isPalindrome(int n){
		int rev=0;	int num=n;
		while(n>0){
			rev=10*rev+n%10;
		n=n/10;
		}
	return rev==num;
	}
}










