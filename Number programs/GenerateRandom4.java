import java.util.*;
class GenerateRandom4
{
	public static void main(String[] args)
	{
		Random r1=new Random();
		int start=1000;
		int end=9999;

		int num=start+r1.nextInt(end-start);
		System.out.println("Random number is: "+num);

	}
}



