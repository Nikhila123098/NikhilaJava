package Handson_Inherit;

class Parent1
{
	static void statehighway()
	{
		System.out.println("Inside State");
		}
	void sh()
	{
		
			System.out.println("Inside sh");
			
	}	
}
public class Inherit_SameClass extends Parent1{
	static void cityroad()
	{
		
			System.out.println("Inside City");
			
	}	
	void cityroad1()
	{
		
			System.out.println("Inside Cityroad1");
			
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Inherit_SameClass c=new Inherit_SameClass();	
cityroad();
statehighway();
c.cityroad1();
c.sh();
	}


	}

