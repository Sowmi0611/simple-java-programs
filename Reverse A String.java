import java.utli.Scanner;
class ReverseofaString
{
	public static void main(string[] arg)
	{
	ReverseofaString rev=new ReverseofaString();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  str=sc.nextLine();
	System.out.printn("Reverse of a String  is : "+rev.reverse(str));
	}
static String reverse(String s)
	{
	String rev="";
	for(in j=s.length();j>0;--j)
	{
	rev=rev+(s.charAt(j-1));
	}
	return rev;
	}
}
