import java.util.Scanner;
class ComplexNum
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void read()	
	{
		System.out.println("Enter Value for real part: ");
		a=sc.nextInt();
		System.out.println("Enter Value for imaginary part: ");
		b=sc.nextInt();

	}
}

public class Complex
{
	public static void main(String args[])
	{
		int x,y;
		ComplexNum c1=new ComplexNum();
		System.out.println("Complex Number 1: ");
		c1.read();
		ComplexNum c2=new ComplexNum();
		System.out.println("Complex Number 2: ");
		c2.read();
		x=c1.a+c2.a;
		y=c1.b+c2.b;
		System.out.println("Complex Number 1= "+c1.a+"+"+c1.b+"i");
		System.out.println("Complex Number 2= "+c2.a+"+"+c2.b+"i");
		System.out.println("Result= "+x+"+"+y+"i");

	}
}