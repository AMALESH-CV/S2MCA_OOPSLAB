import java.util.Scanner;

class person
{
	int age;
	String name,gender,address;
	person()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter Details of Person: ");
      System.out.println("Enter Name: ");
      name=sc.next();
      System.out.println("Enter gender: ");
      gender=sc.next();
      System.out.println("Enter Address: ");
      address=sc.next();
      System.out.println("Enter Age: ");
      age=sc.nextInt();
  
	}
}

class employee extends person
{
  int empid,salary;
	String compname,qual;
	employee()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("\n Enter EMPID: ");
      empid=sc.nextInt();
       System.out.println("\n Enter Company Name: ");
      compname=sc.next();
        System.out.println("\n Enter Qualification: ");
      qual=sc.next();
      System.out.println("\n Enter SALARY: ");
      salary=sc.nextInt();
    } 
}

class teacher extends employee
{
  int tid;
  String sub,dept;
  teacher()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("\n Enter teacher ID: ");
      tid=sc.nextInt();
       System.out.println("\n Enter Subject: ");
      sub=sc.next();
        System.out.println("\n Enter Department: ");
      dept=sc.next();
  }

   void disp()
    {
        System.out.println("\nNAME: "+name);
        System.out.println("GENDER: "+gender);
        System.out.println("ADDRESS: "+address);
        System.out.println("AGE: "+age);
        System.out.println("EMPLOYEE ID: "+empid);
        System.out.println("COMPANY NAME: "+compname);
        System.out.println("QUALIFICATION: "+qual);
        System.out.println("SALARY: "+salary);
        System.out.println("SUBJECT: "+sub);
        System.out.println("DEPARTMENT: "+dept);
        System.out.println("TEACHER ID: "+tid);
    }
}
   

public class PersonInherit
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
     System.out.println("\nEnter the no.of Persons:");
     n=sc.nextInt();
     teacher t[]=new teacher[n];
     for(int i=0;i<n;i++)
     {
       t[i]=new teacher();
     }

      System.out.println("\nDETAILS OF PERSONS");
      for(int i=0;i<n;i++)
      {
        t[i].disp();
      }
  }
}