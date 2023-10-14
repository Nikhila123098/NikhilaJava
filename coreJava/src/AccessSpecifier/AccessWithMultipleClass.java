package AccessSpecifier;

class A{
	public void add()
	{
		System.out.println("Add");
	}
	
	private void sub()
	{
		System.out.println("Sub");

	}
	
protected void mul()
{
	System.out.println("Mul");

}

void div()
{
	System.out.println("Div");

}
}
public class AccessWithMultipleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.add();
		//a.sub(); since it is private cant access within a package
		a.mul();
		a.div();

	}

}
