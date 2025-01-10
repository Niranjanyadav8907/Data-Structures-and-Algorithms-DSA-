import java.util.Scanner;
class HexadecimalToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Hexadecimal Number: ");
		String hex=sc.next();
		String decimal=hexadecimalToDecimal(hex);
		System.out.println(decimal);
	}	
	public static String hexadecimalToDecimal(String s1)
	{
		int dec=0;	int sixteenmultiple=1;
		for(int i=s1.length()-1;i>=0;i--){
			char p=s1.charAt(i);
			if(p>='0' && p<='9')
				dec=dec+(p-48)*sixteenmultiple;
			else if(p>='A' && p<='F')
				dec=dec+(p-55)*sixteenmultiple;
			else if(p>='a' && p<='f')
				dec=dec+(p-87)*sixteenmultiple;
			else
				return s1+" is NOT a valid Hexadecimal Number";
			sixteenmultiple=16*sixteenmultiple;
		}
	return "Hexadecimal "+s1+" in Decimal is: "+dec;	
	}
}






