package Handson_Inherit;
class Parent
{
	 void add()
	{
		System.out.println("Inside Parent Method");

	}
}
 public class OverRiding extends Parent{
  void add()
{
	 super.add();
	System.out.println("Inside Child Method");
	super.add();
}
	public static void main(String[] args) {
		OverRiding o=new OverRiding();
		o.add();
	//	Parent P = new Parent();//Accessing parent class by creating Obj
	//	P.add();
	}

}
