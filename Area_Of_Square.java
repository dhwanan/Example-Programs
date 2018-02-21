import java.util.Scanner;

public class SquareArea {

	 
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double side;
		double area;
		
		System.out.println("Enter side of a square:");
		side=sc.nextDouble();
		
		area=side*side;
		System.out.println("Area of square is:"+ area);
		

	}

}
