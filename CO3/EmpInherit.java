import java.util.Scanner;

class employee
{
	int id,salary;
	String name,address;
	employee()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter Details of Employee: ");
      System.out.println("\nEnter Employee ID: ");
      id=sc.nextInt();
      System.out.println("Enter Employee Name: ");
      name=sc.next();
      System.out.println("Enter Salary: ");
      salary=sc.nextInt();
      System.out.println("Enter Address: ");
      address=sc.next();
	}
}

class teacher extends employee
{
	String department,subject;
	teacher()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the Subject: ");
      subject=sc.next();
      System.out.println("\nEnter the Department: ");
      department=sc.next();
    } 

    void disp()
    {
        System.out.println("\nID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("ADDRESS: "+address);
        System.out.println("SALARY: "+salary);
        System.out.println("SUBJECT: "+subject);
        System.out.println("DEPARTMENT: "+department);
    }
}


public class EmpInherit
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
     System.out.println("\nEnter the no.of Teachers:");
     n=sc.nextInt();
     teacher t[]=new teacher[n];
     for(int i=0;i<n;i++)
     {
       t[i]=new teacher();
     }

      System.out.println("\nDETAILS OF THE TEACHERS");
      for(int i=0;i<n;i++)
      {
        t[i].disp();
      }
  }
}