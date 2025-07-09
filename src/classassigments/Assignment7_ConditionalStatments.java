package classassigments;

public class Assignment7_ConditionalStatments {

	public static void main(String[] args) {
		
		//Based on below details, print whether user is eligible to get the loan or not
		
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		System.out.println("Check whether user is eligible to get the loan or not");
		
		/*
		    A bank evaluates loan applicants based on the following criteria:
			1. Credit Score:
				o If the credit score is above 750, the loan is automatically approved.
				o If the credit score is between 650 and 750, additional checks are performed.
				o If the credit score is below 650, the loan is denied.
			2. Income:
				o For credit scores between 650 and 750, the customer’s income must be at least $50,000
				for the loan to be considered.			
			3. Employment Status:
				o If the customer’s income is at least 50,000, the system checks whether the customer is
				employed.
				o If the customer is unemployed, the loan is denied.
			4. Debt-to-Income Ratio:
				o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
				o If the DTI ratio is less than 40%, the loan is approved.
				o If the DTI ratio is 40% or greater, the loan is denied.
		*/
		
		if(creditScore>750) {	
			
			System.out.println("The loan is automatically approved.");
			
		} else 
			if(creditScore>=650 || creditScore>=750){
				
				System.out.println("Additional checks are performed.");	
				
				if(income>=55000.0 ) {
					
					System.out.println("The customer John Doe's income is 50,000, the loan can be considered.");
				}
				if(isEmployed = true) {
					 System.out.println("Customer John Doe is eligible for the loan.");
				} else
				{
					System.out.println("Loan is denied.");
				}
				if (debtToIncomeRatio<40) {
					
					System.out.println("The Loan is approved.");
					
				} else 
					if (debtToIncomeRatio>40){
						
					System.out.println("The Loan is denied.");
				}
				
			}else
				if(creditScore<650) {					
					System.out.println("The loan is denied.");						
				} 

		}

}
