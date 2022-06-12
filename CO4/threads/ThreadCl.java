import java.util.Scanner;
class multip extends Thread
	{
		int i;
		public void run()
		{
			System.out.println("Multiplication table of 5");
				for(int i=1;i<=10;i++)
				{
					System.out.println(i+" * 5 = "+(i*5));
				}
		}
	}

class primes extends Thread
{
			int i,j,x,counts=0;
			Scanner sc=new Scanner(System.in);
			primes()
			{
				System.out.println("Enter value for prime:");
				x=sc.nextInt();
			}

		public void run()
		{
			
			System.out.println("Prime Numbers are:");
			for(i=2;i<=x;i++)
			{
				for(j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						counts=counts+1;
					}
				}

				if(counts==2)
				{
					System.out.println(i);
				}
				counts=0;

			}


		}
}

public class ThreadCl
{
	public static void main(String args[])
	{
		primes p=new primes();
		multip m=new multip();
		p.start();
		m.start();	
	}
}