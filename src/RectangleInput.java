/**
 * 
 * @author Akira Morales
 * 02 OCT 2018 Homework
 */
import java.util.Scanner;

public class RectangleInput {

	public static void main(String[] args)
	{
		Scanner wth = new Scanner(System.in);
		Scanner lgth = new Scanner(System.in);
		
		System.out.print("Input the width of the rectangle: ");
		double width = wth.nextDouble();
		wth.nextLine();
		
		System.out.print("Input the length of the rectangle: ");
		double length = lgth.nextDouble();
		lgth.nextLine();
		
		double area = length * width;
		double perimeter = 2 * length + 2 * width;
		double diagonal = Math.sqrt(length * length + width * width);
		
		System.out.printf("Area:  %18.2f\n", area);
		System.out.printf("Perimeter:  %13.2f\n", perimeter);
		System.out.printf("Length of diagonal:  %3.2f", diagonal);
		
	}

}
