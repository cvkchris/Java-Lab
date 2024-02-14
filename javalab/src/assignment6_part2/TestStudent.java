package assignment6_part2;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		String name;
		int rollNumber;
		double mark1, mark2, mark3, mark4, mark5;

		Scanner scan = new Scanner(System.in);

		System.out.println("----RESULT GENERATOR----");
		System.out.println("Enter Name: ");
		name = scan.next();
		System.out.println("Enter Roll Number: ");
		rollNumber = scan.nextInt();
		System.out.println("Mark 1");
		mark1 = scan.nextDouble();
		System.out.println("Mark 2");
		mark2 = scan.nextDouble();
		System.out.println("Mark 3");
		mark3 = scan.nextDouble();
		System.out.println("Mark 4");
		mark4 = scan.nextDouble();
		System.out.println("Mark 5");
		mark5 = scan.nextDouble();
		
		Result r = new Result(name, rollNumber, mark1, mark2, mark3, mark4, mark5);
		
		r.display();

	}
}
