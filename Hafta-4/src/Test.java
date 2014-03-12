import java.util.Scanner;

/**
 * 
 */

/**
 * @author sakkas
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int choice;
		Scanner input=new Scanner(System.in);
		Circle c=new Circle();
		Square s=new Square();

		while(true){
			System.out.println("Welcome to Circle/Square Tester. Please select an entry from menu:");
			System.out.println("1 - Modify a circle object");
			System.out.println("2 - Modify a square object");
			System.out.println("3 - Compare square and circle");
			System.out.println("4 - Exit");
			try{
				choice=input.nextInt();
				if(choice==1)
				{
					System.out.print("Enter radius:");
					c.setRadius(input.nextInt());
				}
				else if(choice==2)
				{
					System.out.print("Enter length:");
					s.setLength(input.nextInt());
				}
				else if(choice==3)
				{
					System.out.println("Circle area="+c.getArea()+" - Square area="+s.getArea());
					int res=c.CompareArea(s);
					if(res==0)
						System.out.println("Areas are equal");
					else if(res==1)
						System.out.println("Circle is bigger than square");
					else System.out.println("Square is bigger than circle");
				}
				else if(choice==4)
					System.exit(-1);
				else
					System.out.println("Invalid choice");
			}
			catch(Exception e)
			{
				System.out.println("Invalid input");
				System.exit(-1);
			}
		}

	}

}
