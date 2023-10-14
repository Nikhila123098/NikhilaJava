package coreJavaToken;

public class MethodOrderAssignment {
static {
	System.out.println("Inside 1st Static");
}
static {
	System.out.println("Inside 2nd Static");
}
{

	System.out.println("Inside 1st IIB");
}
{

	System.out.println("Inside 2nd IIB");
}
MethodOrderAssignment()
{

	System.out.println("Inside NonPara Constructor");
}
MethodOrderAssignment(int a){

	System.out.println("Inside Para Constructor");
}
static void m1()
{

	System.out.println("Inside  Static Method");
}
void m2()
{

	System.out.println("Inside Non Static Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inside Main method");
		MethodOrderAssignment moa=new MethodOrderAssignment(4);
		new MethodOrderAssignment();
		m1();
		moa.m2();
	}

}
