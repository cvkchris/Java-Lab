package assignment5_1;

public class Assignment5_part1 {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(20);
		System.out.println("Circle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		Rectangle r = new Rectangle(10,12);
		System.out.println("\n\nRectangle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		Triangle t = new Triangle(20,30,15,30,24);
		System.out.println("\n\nTriangle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		
	}

}
