import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Scanner;

public class TriangleTest {
	
	    private double side1 = 1.0;
	    private double side2 = 1.0;
	    private double side3 = 1.0;

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter three sides of the Triangle");
	        double side1 = input.nextDouble();
	        double side2 = input.nextDouble();
	        double side3 = input.nextDouble();

	        System.out.println("The Area is " + (side1 + side2 + side3) / 2);
	        System.out.println("The Perimeter is "
	                           + (side1 + side2 + side3));
}
}
