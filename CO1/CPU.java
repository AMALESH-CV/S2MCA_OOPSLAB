import java.util.Scanner;

class comp
{
	Scanner sc= new Scanner(System.in);
	int price;

	void getcpu()
	{
		System.out.println("\n Enter Price of CPU: ");
		price=sc.nextInt();
	}

	class processor
	{
		int ncore;
		String manf;
		
		void getprocessor()
		{
			System.out.println("\n Enter the no.of Cores of the Processor: ");
			ncore=sc.nextInt();
			System.out.println("\n Enter Processor Manufacture's name: ");
			manf=sc.next();
		}

		void putprocessor()
		{
			System.out.println("\nThe No.of cores in the Processor: "+ncore);
			System.out.println("\nThe Manufacturer of the Processor: "+manf);

		}
	}

	static class ram
	{
		int memory;
		String manf;
		Scanner sc=new Scanner(System.in);
		
		void getram()
		{
			System.out.println("\n Enter RAM Capacity: ");
			memory=sc.nextInt();
			System.out.println(" \n Enter RAM Manufacturer: ");
			manf=sc.next();
		}

		void putram()
		{
			System.out.println("\nThe RAM Capacity of CPU is : "+memory+"GB");
			System.out.println("\nThe RAM Manufacturer is: "+manf);
		}

	}
}

public class CPU
{
	public static void main(String args[])
	{
		comp c=new comp();
		comp.processor p=c.new processor();
		comp.ram r=new comp.ram();

		c.getcpu();
		p.getprocessor();
		r.getram();

		System.out.println("\n\n CPU DETAILS ");
		p.putprocessor();
		r.putram();
	}
}