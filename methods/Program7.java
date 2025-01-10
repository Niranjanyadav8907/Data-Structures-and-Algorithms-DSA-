class Program7
{
	public static void addNumbers(int p, int q){
		System.out.println("This is add method");
		int sum=p+q;
		System.out.println("Sum of "+p+","+q+" is: "+sum);
	}
	public static void main(String[] args){
		System.out.println("main method starts");
		addNumbers(34, 42);
		System.out.println("===============");
		addNumbers(123, 564);
		System.out.println("main method ends"); 
	}
}



