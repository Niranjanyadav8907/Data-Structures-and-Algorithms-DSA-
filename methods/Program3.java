class Program3
{
	public static void test(){
		System.out.println("Program3 test method starts");
		System.out.println("Program3 test method ends");
	}
	public static void demo(){
		System.out.println("Program3 demo method starts");
		test();
		System.out.println("Program3 demo method ends");
	}
	public static void main(String[] args){
		System.out.println("Program3 main method starts");
		demo();
		System.out.println("Program3 main method ends");
	}
}



