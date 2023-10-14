package Handson_Inherit;
abstract class A1{
	abstract void netflix();
	abstract void prime();
	void inbuilt()
	{
		System.out.println("In Abstract class A1-Conc Method");
	}
	
	void conc()
	{
		System.out.println("In conc method");
	}
	
}

abstract class A3 extends A1
{
	abstract void hotstar();
	abstract void zee5();
	void concMethod()
	{
		System.out.println("Inside A3 method-Conc");
	}
	void concMethod1()
	{
		System.out.println("Inside cocnMethod method-Conc");

	}
	/*void netflix() {
		System.out.println("InNetflix");

	}

	void prime() {
		System.out.println("InPrime");

	}*/
}
public class Assign30 extends A3 {
void netflix() {
	System.out.println("InNetflix");

}

void prime() {
	System.out.println("InPrime");

}

void hotstar()
{
	System.out.println("Inhotstar");

}
void zee5()
{
	System.out.println("Inzee5");

}
	public static void main(String[] args) {
		Assign30 a30= new Assign30();
		a30.netflix();
		a30.prime();
		a30.hotstar();
		a30.zee5();
		a30.inbuilt();
		a30.conc();
		a30.concMethod();
		a30.concMethod1();
	}

}
