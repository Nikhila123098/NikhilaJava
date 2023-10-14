package coreJavaToken;

public class assignmentNonStatic {
	
	static void yearlySalary()
	{
		int monthlySalary=2000,yearlySalary;
		yearlySalary=monthlySalary*12;
		System.out.println("YearlySalary:"+ yearlySalary);
	}
 void charityContribution()
 {

		int monthlySalary=2000,yearlySalary,charityAmount;
		yearlySalary=monthlySalary*12;
		//System.out.println("YearlySalary:"+ yearlySalary); 
		charityAmount=(yearlySalary*10)/100;
	    System.out.println("CharityAmount:"+ charityAmount);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yearlySalary();  //Accessing Static method directly
		assignmentNonStatic A= new assignmentNonStatic();
		A.charityContribution();//Accessing non static method
		//A.yearlySalary(); //Accessing static method by creating object

	}

}
