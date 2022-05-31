import java.util.Scanner;
public class MAddition
{
	public static void main(String args[])
	{
		int i,j,r1,c1,r2,c2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Rows in Matrix 1: ");
		r1=sc.nextInt();
		System.out.println("Enter the Number of Columns in Matrix 1: ");
		c1=sc.nextInt();
		System.out.println("Enter the Number of Rows in Matrix 2: ");
		r2=sc.nextInt();
		System.out.println("Enter the Number of Columns in Matrix 2: ");
		c2=sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int result[][]=new int[r2][c2];

		if(r1==r2 && c1==c2)
		{
			System.out.println("Enter the Elements of Matrix 1");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}

			System.out.println("Enter the Elements of Matrix 2");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}

			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					result[i][j]=a[i][j]+b[i][j];
				}
			}

			System.out.println("Resultant Matrix");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print(result[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		else
		{
			System.out.println("Matrix Addition is not Possible");
		}
	}
}
