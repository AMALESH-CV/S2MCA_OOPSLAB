import java.util.Scanner;
interface result
{
	public void area();
	public void perimeter();
}

class circle implements result
{
	Scanner sc=new Scanner(System.in);
	double r,ar,per;
	public void area()
	{
		System.out.println("Enter Radius");
		r=sc.nextFloat();
		ar=3.14*r*r;
		System.out.println("Area of Circle is: "+ar);
	}

	public void perimeter()
	{
		per=2*3.14*r;
		System.out.println("Perimeter of Circle is:"+per);
	}
}

class rectangle implements result
{
	int l,b,ar,per;
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

	public void perimeter()
	{
		per=2*(l+b);
		System.out.println("Perimeter of Rectangle is: "+per);
	}

}


public class Areap
{
	public static void main(String args[])
	{
		int op;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n MENU \n 1.CIRCLE \n 2.RECTANGLE ");
		System.out.println("\n Choose an option: ");
		op=sc.nextInt();
		switch(op)
		{
			case 1:
			circle c=new circle();
			c.area();
			c.perimeter();
			break;
			case 2:
			rectangle re=new rectangle();
			re.area();
			re.perimeter();
			break;
			default:
			System.out.println("Invalid Option");
		}
	}
}