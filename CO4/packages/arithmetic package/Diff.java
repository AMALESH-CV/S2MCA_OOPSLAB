package arithmetic;
import java.util.Scanner;



public class Diff implements arops
{
	Scanner sc=new Scanner(System.in);
	int a,b,d;
	public void arithmeticop()
	{
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		d=a-b;
		System.out.println("Difference of the Numbers: "+d);
	}
}