import java.util.Scanner;
class Product
{
	int pcode,price;
	String pname;

	void read()
	{
		System.out.println(" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Code: ");
		pcode=sc.nextInt();
		System.out.println("Enter Product Name: ");
		pname=sc.next();
		System.out.println("Enter Product Price: ");
		price=sc.nextInt();
	}

	void display()
	{
		System.out.println(" ");
		System.out.println("Pcode: "+pcode);
		System.out.println("Pname: "+pname);
		System.out.println("price: "+price);
	}
}

public class ProductLower
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		Product ob1=new Product();
		System.out.println("Enter Details of Product 1: ");
		ob1.read();

		Product ob2=new Product();
		System.out.println("Enter Details of Product 2: ");
		ob2.read();

		Product ob3=new Product();
		System.out.println("Enter Details of Product 3: ");
		ob3.read();

		System.out.println("\n PRODUCT WITH LOWER PRICE ");
		if(ob1.price<ob2.price&&ob1.price<ob3.price)
		{
			ob1.display();
		}
		else if(ob2.price<ob3.price&&ob2.price<ob1.price)
		{
			ob2.display();
		}
		else
		{
			ob3.display();
		}
	}
}
