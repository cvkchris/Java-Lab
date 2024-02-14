package assignment5_2;

public class NormalEmployee extends Employee {
	

	double paidDays, basicWage, epf, hra, esi, conveyanceAllowance, professionalTax, 
	medicalAllowance, loanRecovery, otherAllowances, totalEarnings, totalDeductions, netSalary;
	
	public NormalEmployee(String name, String address, int basicSalary, int lOP, int workingDays) {
		super(name, address, basicSalary, lOP, workingDays);
		paidDays = workingDays - lOP;		
		basicWage = (basicSalary/workingDays)*paidDays*(45*100);
		if(basicWage>=15000)		
			epf = 15000*(12/100);
		else
			epf = basicWage*(15/100);
		
		hra = basicWage*0.4;
		
		if(basicSalary<=21000)
			esi = basicSalary*(0.75/100);
		else
			esi = 0;
		
		conveyanceAllowance = (1600/workingDays)*paidDays;
		medicalAllowance = (1250/workingDays)*paidDays;
		otherAllowances = (basicSalary/workingDays)*paidDays -(basicWage+hra+conveyanceAllowance+medicalAllowance);
		
		totalEarnings = basicWage+hra+conveyanceAllowance+medicalAllowance+otherAllowances;
		totalDeductions = epf+esi+professionalTax+loanRecovery;
		
		netSalary = totalEarnings-totalDeductions;
				
		
	}
	
	
	
	

}
