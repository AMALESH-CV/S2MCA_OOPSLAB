package arithmetic;
import java.util.Scanner;



public class Div implements arops
{
	Scanner sc=new Scanner(System.in);
	int a,b,d;
	public void arithmeticop()
	{
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();

		if(a==0 || b==0)
		{
			System.out.println("Division by zero not possible");
		}
		else
		{
			d=a/b;
			System.out.println("Answer is: "+d);
		}
	}
}