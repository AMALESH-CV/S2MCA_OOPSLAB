import java.util.Scanner;
class Employee
{
	String eno,ename;
	int esalary;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("\n Enter Employee Number: ");
		eno=sc.next();
		System.out.println("\n Enter Employee Name: ");
		ename=sc.next();
		System.out.println("\n Enter Salary of Employee: ");
		esalary=sc.nextInt();
	}

	void display()
	{
		System.out.println("\n Employee Number: "+eno);
		System.out.println("\n Enter Employee Name: "+ename);
		System.out.println(" \n Enter Salary: "+esalary);
	}
	
}

public class Emp
{
	public static void main(String args[])
	{
		int i,n,c=0;
		String x;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter Number of Employees: ");
		n=sc.nextInt();
		Employee e[]=new Employee[n];

		for(i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			e[i].read();
		}

		System.out.println(" \n For Searching an Employee, Enter the Employee Number ");
		x=sc.next();
		for(i=0;i<e.length;i++)
		{
			if(e[i].eno.equals(x))
			{ 
   				c=1;
   				System.out.println("\n Employee Found in the database");
   				System.out.println("\n Details of the Employee");
				e[i].display();
				break;
			}
		}
		if(c==0)
		System.out.println("Employee not found");
	}
}

