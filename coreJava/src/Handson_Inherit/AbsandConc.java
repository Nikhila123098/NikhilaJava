package Handson_Inherit;

abstract class A2{//abs class
	abstract  void a1();//abs method
	
}

public class AbsandConc extends A2{//conc class
	 void a1() //conc method
	{
		System.out.println("Abs and Cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsandConc ac = new AbsandConc();
		ac.a1();

	}

}
