package Exception;

import java.util.InputMismatchException;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=1/1;
	
			System.out.println(a);
		}

		catch(ArithmeticException e)
		{
			System.out.println("Handled");
			}

		catch(NullPointerException e)
		{
			System.out.println("Handled E2");
			}

		catch(InputMismatchException e)
		{
			System.out.println("Handled E3");
			}
		finally
		{
			System.out.println("Finally");
		}
	}

}
