package graphics;
import java.util.Scanner;
public class Rect implements shapes
{
	int l,b,ar;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Breadth");
		b=sc.nextInt();
		ar=l*b;
		System.out.println("Area of Rectangle is: "+ar);
	}
}
