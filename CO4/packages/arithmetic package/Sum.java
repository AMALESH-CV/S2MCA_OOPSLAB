package arithmetic;
import java.util.Scanner;



public class Sum implements arops
{
	Scanner sc=new Scanner(System.in);
	int a,b,s;
	public void arithmeticop()
	{
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		s=a+b;
		System.out.println("Sum of the Numbers is: "+s);
	}
}