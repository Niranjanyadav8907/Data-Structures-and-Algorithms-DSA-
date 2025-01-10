class Program5
{
	public static void test(int x){
		System.out.println("This is Test method");
		int sq=x*x;
		System.out.println(x+" Square is: "+sq);
	}
	public static void main(String[] args){
		System.out.println("main method starts");
		int x=23;
		test(x);
		System.out.println("main method ends"); 
	}
}



