package assignment6_part2;

import java.util.Scanner;

public class Result extends Student implements Exam {

	public Result(String name, int rollNumber, double mark1, double mark2, double mark3, double mark4, double mark5) {
		super(name, rollNumber, mark1, mark2, mark3, mark4, mark5);

	}

	@Override
	public double percent_cal() {
		double percent = (super.getMark1() + super.getMark2() + super.getMark3() + super.getMark4() + super.getMark5())
				/ 5;
		return percent;
	}

	public void display() {
		System.out.println("\n--------Results--------");
		System.out.println("Name: " + super.getName() + "\nRoll Number: " + super.getRollNumber() + "\nPercentage: "
				+ percent_cal());
	}

}
