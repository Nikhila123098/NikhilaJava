package coreJavaToken;

public class IIBAssignment {
	static
	{
		System.out.println("Inside Static");
		}
	{
		System.out.println("Inside IIB");
	}
	IIBAssignment()
	{
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//new IIBAssignment();
System.out.println("Inside Main");
new IIBAssignment();
	}

}
