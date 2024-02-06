package assignment1_part2;

public class Calculator {

	public static void main(String[] args) {

		Input scan = new Input();
		Operations calc = new Operations();

		System.out.println("Calculator " + "\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication"
				+ "\n4. Division" + "\n5. Power" + "\n6. Squareroot");

		int choice;
		double num[] = new double[2];
		double number;
		double result;

		do {
			System.out.println("Calculator " + "\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication"
					+ "\n4. Division" + "\n5. Power" + "\n6. Squareroot");
			choice = scan.inputNum();
			switch (choice) {
			case 1:
				num = scan.inputNumbers();
				System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
				result = calc.addition(num[0], num[1]);
				System.out.println("Result : " + result);
				break;

			case 2:
				num = scan.inputNumbers();
				System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
				result = calc.subtraction(num[0], num[1]);
				System.out.println("Result : " + result);
				break;

			case 3:
				num = scan.inputNumbers();
				System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
				result = calc.mult(num[0], num[1]);
				System.out.println("Result : " + result);
				break;

			case 4:
				num = scan.inputNumbers();
				System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
				result = calc.div(num[0], num[1]);
				System.out.println("Result : " + result);
				break;

			case 5:
				num = scan.inputNumbers();
				System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
				result = calc.power(num[0], num[1]);
				System.out.println("Result : " + result);
				break;

			case 6:
				number = scan.inputDouble();
				System.out.println("Number: ");
				result = calc.sqrt(number);
				System.out.println("Result : " + result);
				break;

			default:
				System.out.println("Invalid Choice. Choose from index 1 to 6");
			}
		} while (choice > 6);
	}

}
