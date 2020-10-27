import java.util.Scanner;
public abstract class AreaOfRectangle {
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Please enter the length of the rectangle:");
	   double length = scanner.nextDouble();
	   System.out.println("Please enter the width of rectangle:");
	   double width = scanner.nextDouble();
	   //length*width;
	   double area = length*width;
	   System.out.println("The area of rectangle is:"+area);
   }
}