package arithmetic;
import java.util.Scanner;



public class Multi implements arops
{
	Scanner sc=new Scanner(System.in);
	int a,b,m;
	public void arithmeticop()
	{
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		m=a*b;
		System.out.println("Product of the Numbers is: "+m);
	}
}