import arithmetic.Sum;
import arithmetic.Diff;
import arithmetic.Multi;
import arithmetic.Div;

import java.util.Scanner;


public class Arith
{
	public static void main(String args[])
	{
		int op;
		Scanner sc=new Scanner(System.in);

		do
		{
		
			System.out.println("\n MENU  \n 1.ADDITION \n 2.SUBSTRACTION \n  3.MULTIPLICATION \n 4.DIVISION ");
			System.out.println("\n Choose an option: ");
			op=sc.nextInt();

			switch(op)
			{
				case 1:
				Sum su=new Sum();
				su.arithmeticop();
				break;

				case 2:
				Diff di=new Diff();
				di.arithmeticop();
				break;

				case 3:
				Multi mul=new Multi();
				mul.arithmeticop();
				break;

				case 4:
				Div d=new Div();
				d.arithmeticop();
				break;

				default:
				System.out.println("Invalid Option");
				break;
			}

		} while(op<5);
	}
}