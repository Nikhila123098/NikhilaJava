package Handson_Inherit;

class S
{
	S()
	{
		System.out.println("In Parent class Constructor");

	}
	
	S(int a){
		System.out.println("In Parent class Para Constructor");

	}
}

public class SuperCalling extends S{
	SuperCalling()
	{
		
		//super();//Explicit Super calling non para
		System.out.println("In Child class Constructor");
	}
	
	SuperCalling(String a)
	{
		
		super(8);//Explicit Super calling non para
		System.out.println("In Child class Para Constructor");
	}
	public static void main(String[] args) {
		new SuperCalling();
		new SuperCalling("hi");
		//new S();//Object can be created for any class

	}

}
