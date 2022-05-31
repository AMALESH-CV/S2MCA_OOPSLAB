import java.util.Scanner;
public class StringOps
{
	public static void main(String args[])
	{
		String s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter a String: ");
		s1=sc.next();
		System.out.println("\n Enter another String: ");
		s2=sc.next();
		System.out.println("\n String 1 is: "+ s1);
		System.out.println(" \n String 2 is: "+ s2);

		if(s1.equals(s2))
		{
			System.out.println("\n Both The Strings Are Equal");
		}
		else
		{
			System.out.println("\n Strings are not Equal");
		}

		System.out.println("\n Length of String 1: "+ s1.length());
		System.out.println("\n Length of String 2: "+ s2.length());

		System.out.println("\n String 1 in Uppercase: "+s1.toUpperCase());

		System.out.println("\n String 1 in Lowercase: "+s1.toLowerCase());

		System.out.println("\n Concatinating String 2 with String 1: "+s1.concat(s2));

		System.out.println("\n First Character of String 1: "+ s1.charAt(1));

		System.out.println("\n Replcaing all A's in string 1 with K: "+ s1.replace('A','K'));

		System.out.println("\n Substring of String 1: "+s1.substring(2));

	}
}