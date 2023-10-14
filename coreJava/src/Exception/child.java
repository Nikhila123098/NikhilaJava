package Exception;

class grandfather
{
	void gf()
	{
		
			 System.out.println("Inside Grandfather");

		
	}
}
class father extends grandfather{
	
	void father1()
	{
		 System.out.println("Inside Father");

	}
	
}

public class child extends father{
	void Child1()
	{
		 System.out.println("Inside Child");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		father f=new child();
		f.gf();
		f.father1();
		
		child c1=(child)f;
		c1.father1();
		c1.gf();
		c1.Child1();
		

	}

}
