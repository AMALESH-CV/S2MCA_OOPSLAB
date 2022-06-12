package graphics;
import java.util.Scanner;
public class Triangle implements shapes
{
	double b,h,ar;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter Breadth");
		b=sc.nextFloat();
		System.out.println("Enter Height");
		h=sc.nextFloat();
		ar=0.5*b*h;
		System.out.println("Area of Traingle is: "+ar);
	}
}
