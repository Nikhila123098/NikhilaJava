package Handson_Inherit;

interface GoogleAuth
{
	void un();
	void pwd();
}

interface Google2wayAuth
{
	void sms();
	void call();
}

public class Multiple_Inheritance_Through_Interface implements Google2wayAuth,GoogleAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Inheritance_Through_Interface mi=new Multiple_Inheritance_Through_Interface();
		mi.un();
		mi.pwd();
		mi.sms();
		mi.call();
	}
	public void un()
	{
		System.out.println("HI");
	}
	
	public void pwd()
	{
		System.out.println("Hello");

	}
	
	public void sms()
	{
		System.out.println("SMS");

	}
	
	public void call()
	{
		System.out.println("CALL");

	}
	

}
