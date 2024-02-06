package assignment1_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Fibonnacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number of Fibonacci terms: ");
		int n = Integer.parseInt(reader.readLine());
		Series fibonacci = new Series();
		
		System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.printFibonacci(i) + " ");
        }
		System.out.println("\nCompleted");

	}
}
