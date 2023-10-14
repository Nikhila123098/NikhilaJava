package coreJavaToken;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=200,b=300,c=500;
		if(a==203) 
		
		{
			System.out.println("Inside NestedIf");
			if(b==c)
			{
				System.out.println("Nested if");
			}
			else
			{
				System.out.println("Nested Else");
			}
		}
		else
		{
			System.out.println("Only Else");
		}
	}

}
