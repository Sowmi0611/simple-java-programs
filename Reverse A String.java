import java.util.Scanner;
import java.util.*;
class ReverseofaString
{
	public static void main(String[] arg)
	{
	ReverseofaString rev=new ReverseofaString();
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  input=scanner.nextLine();	
	char[] try1 = input.toCharArray();
      for (int i = try1.length-1;i >= 0; i--) System.out.print(try1[i]);
   }
}
