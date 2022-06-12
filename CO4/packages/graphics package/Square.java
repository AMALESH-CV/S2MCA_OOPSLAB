package graphics;
import java.util.Scanner;
public class Square implements shapes
{
	Scanner sc=new Scanner(System.in);
	int a,ar;
	public void area()
	{
		System.out.println("Enter A");
		a=sc.nextInt();
		ar=a*a;
		System.out.println("Area of Square is: "+ar);
	}
}