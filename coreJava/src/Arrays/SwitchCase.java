package Arrays;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		switch(a)
		{
		case 1:System.out.println("Addition");
		break;
		
		case 2:System.out.println("Subtraction");
		break;
		
		case 3:System.out.println("Multiplication");
		break;

		default: System.out.println("Inside Default");

		
		}
		

	}

}
