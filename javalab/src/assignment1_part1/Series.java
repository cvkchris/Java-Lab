package assignment1_part1;

public class Series {

	public int printFibonacci(int x) {
		if (x <= 1) {
			return x;
		} else {
			return printFibonacci(x - 1) + printFibonacci(x - 2);
		}
	}
}
