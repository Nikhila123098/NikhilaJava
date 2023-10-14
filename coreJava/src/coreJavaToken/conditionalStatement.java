package coreJavaToken;

public class conditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Outside if inside main");
		int a=100;
		int b=200;
		
		if(a>b)
		{
			System.out.println("A is lesser"+ a);
			}
		else
		{
			System.out.println("First Else block");
			
		}
		if(a<b)
		{
			System.out.println("B is greater");
		}
		if(a<=b)
		{
			System.out.println("Lesser than equals");
		}
		if(a>=b)
		{
			System.out.println("Greaterthanequals");
		}
		if(a==b)
		{
			System.out.println("Equals");
		}
		if(a!=b)
		{
			System.out.println("NotEquals");
			}
		else {
			System.out.println("Else block");
			
			
		}
		System.out.println("Outside if");

	}

}
