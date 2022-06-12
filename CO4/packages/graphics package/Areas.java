import graphics.Rect;
import graphics.Triangle;
import graphics.Square;
import graphics.Circle;

import java.util.Scanner;


public class Areas
{
	public static void main(String args[])
	{
		int op;
		Scanner sc=new Scanner(System.in);

		do
		{
		
			System.out.println("\n MENU  \n 1.RECTANGLE \n 2.TRIANGLE \n  3.SQUARE \n 4.CIRCLE ");
			System.out.println("\n Choose an option: ");
			op=sc.nextInt();

			switch(op)
			{
				case 1:
				Rect re=new Rect();
				re.area();
				break;

				case 2:
				Triangle t=new Triangle();
				t.area();
				break;

				case 3:
				Square sq=new Square();
				sq.area();
				break;

				case 4:
				Circle c=new Circle();
				c.area();
				break;

				default:
				System.out.println("Invalid Option");
				break;
			}

		} while(op<5);
	}
}