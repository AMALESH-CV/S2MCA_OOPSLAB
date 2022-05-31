import java.util.Scanner;
public class Search
{
	public static void main(String args[])
	{
		int i,n,x,c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];

		System.out.println("Enter the size of the Array:");
		n=sc.nextInt();

		System.out.println("Enter the Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}


		System.out.println("The Elements in the Array are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}

		System.out.println("Enter the element to search: ");
		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(x==a[i])
			{
				c=1;
				System.out.println("Element Found at Index "+i );
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Element not found");
		}

	}
}
