class Program6
{
	public static void getSquare(int p){
		System.out.println("This is Test method");
		int sq=p*p;
		System.out.println(p+" Square is: "+sq);
	}
	public static void main(String[] args){
		System.out.println("main method starts");
		int x=45;
		getSquare(x);
		System.out.println("===============");
		getSquare(28);
		System.out.println("main method ends"); 
	}
}



