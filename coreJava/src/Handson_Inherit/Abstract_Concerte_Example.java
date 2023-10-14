package Handson_Inherit;

abstract class parentAdd{
	abstract void add();//abs method
	
	 void sub()
	{
		int a=50,b=30,c;
		c=a-b;
		System.out.println(":Sub:"+c);
	}
}
public class Abstract_Concerte_Example  extends parentAdd{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Concerte_Example ac=new Abstract_Concerte_Example();
		ac.add();
	 
		ac.sub();
		
	}
	void add()//overriden method
	{
		int a=50,b=30,c;
		c=a+b;
		System.out.println("The value of C:"+c);
	}

}
