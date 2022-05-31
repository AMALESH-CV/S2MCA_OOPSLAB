import java.util.Scanner;
public class Symmetric
{
	public static void main(String args[])
	{
		int i,j,n,c=0,r,cl;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size: ");
		r=sc.nextInt();

		System.out.println("Enter Column Size: ");
		cl=sc.nextInt();

    int a[][]=new int[r][cl];
    int b[][]=new int[r][cl];

		if(r==cl)
		{

			System.out.println("Enter the Elements of Matrix");
			for(i=0;i<r;i++)
			{
				for(j=0;j<cl;j++)
				{
					a[i][j]=sc.nextInt();
				}

			}

			for(i=0;i<r;i++)
			{
				for(j=0;j<cl;j++)
				{
					b[j][i]=a[i][j];
				}
			}


			for(i=0;i<r;i++)
			{
				for(j=0;j<cl;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						c=1;
						break;
					}
				}
			}

			System.out.println("Initial Matrix");
			for(i=0;i<r;i++)
			{
				for(j=0;j<cl;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

			System.out.println("Transpose of the Matrix is ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<cl;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}


			if(c==0)
			{
				System.out.println("The Matrix is Symmetric");
			}
			else
			{
				System.out.println("The Matrix is not Symmetric");
			}
		}

		else
		{
			System.out.println("Operation not Possible");
		}


	}
}
