package coreJavaToken;

public class consAndMethodsHW {
	
	static void CSK()
	{
		System.out.println("CSK");
	}
	
	void RCB()
	{
		System.out.println("RCB");
	}
	consAndMethodsHW()
	{
		System.out.println("Inside Cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new consAndMethodsHW();
		CSK();
		consAndMethodsHW cons= new consAndMethodsHW();
		cons.RCB();
		
	}

}
