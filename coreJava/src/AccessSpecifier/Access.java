package AccessSpecifier;

public class Access{
	private void add()
	{
		System.out.println("InAddition");
	}
	
	public void subtract() {
		System.out.println("InSubtraction");

	}
	
	protected void multiply()
	{
		System.out.println("InMultiplication");

	}
	
	void divide()
	{
		System.out.println("InDivision");

	}
	
	public static void main(String args[])
	{
		Access a =new Access();
		a.add();
		a.subtract();
		a.multiply();
		a.divide();
	}
}