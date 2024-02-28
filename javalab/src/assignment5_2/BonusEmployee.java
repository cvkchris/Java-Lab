package assignment5_2;

import java.util.Scanner;

public class BonusEmployee extends Employee {


	@Override
	public double theMonthly() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Bonus (in percentage) : ");
		double bonus_percent = scan.nextDouble(); 
		
		bonus_percent = bonus_percent / 100;
		
		setNetSalary(getGrossWage()+(getGrossWage()*bonus_percent));
		
		return getNetSalary();
	}

}
