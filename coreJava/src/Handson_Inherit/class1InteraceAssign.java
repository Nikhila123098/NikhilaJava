package Handson_Inherit;
interface i2
{
	void login();
}
interface i1
{
	void validation();
}
 class class3 implements i1,i2
{
	public void login()
	{
		System.out.println("Login inside classs3");

	}
	public void validation()
	{
		System.out.println("Validation inside class3");

	}
}
 class class2 extends class3{
	public void welcome()
	{
		System.out.println("Welcome in Class2");

	}
}
public class class1InteraceAssign  extends class2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class1InteraceAssign c1 = new class1InteraceAssign();
		c1.login();
		c1.validation();
		c1.welcome();
		System.out.println(" in Class 1");

		

	}

}
