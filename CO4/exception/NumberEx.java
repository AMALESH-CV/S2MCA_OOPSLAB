import java.util.Scanner;

class negnum extends Exception 
{
	public negnum(String str)
	{
		super(str);
	}
}

class nums
{
	int n,i,sum=0,x,avg;
	void avg() throws negnum 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit: ");
		n=sc.nextInt();
		System.out.println("Enter the Numbers");
		for(i=0;i<n;i++)
		{
			x=sc.nextInt();
			if(x<0)
			{
				throw new negnum("Negative Numbers not Allowed");
			}
			else
			{
				sum=sum+x;
				avg=sum/n;
			}
		}
	System.out.println("Average is: "+avg);
	}
}

class NumberEx
{
	public static void main(String args[])
	{
		try
		{
			nums a=new nums();
			a.avg();
		}
		catch(negnum n)
		{
			System.out.println("Exception Occured "+n);
		}
	}
}