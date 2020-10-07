import java.utl.Scanner;
class ReverseofaString
{
	public static void main(string[] arg)
	{
	ReverseofaString rev=new ReverseofaString();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  str=sc.nextLine();	
	System.out.rintln("Reverse of a String  is : "+rev.reverse(str));
	}
static String reverse(String s)
	{
	String rev="";
	for(int j=s.ength();j>0;--j)
	{
	rev=rev+(s.charAt(j-1)); 
	}
	return rev;
	}
}
