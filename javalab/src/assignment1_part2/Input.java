package assignment1_part2;

import java.util.Scanner;

public class Input {

	public double[] inputNumbers() {
		Scanner sc = new Scanner(System.in);
		double numbers[] = new double[2];

		System.out.println("Enter First Number: ");
		double firstNum = sc.nextDouble();
		System.out.println("Enter Second Number: ");
		double secondNum = sc.nextDouble();

		numbers[0] = firstNum;
		numbers[1] = secondNum;
		return numbers;
	}

	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice: ");
		int num = sc.nextInt();
		return num;
	}

	public double inputDouble() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();
		return num;
	}
}
