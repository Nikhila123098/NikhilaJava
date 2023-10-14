package Handson_Inherit;
class D extends C{
	void movie3()
	{
		System.out.println("Not a Movie Freak");
	}
	
}
class C {
	void movie2()
	{
		System.out.println("In Hindi Movie");
	}
	
}
class B extends C{
	void movie1()
	{
		System.out.println("In Telugu Movie");
	}
	
	
}
class A extends B{
	void movie()
	{
		System.out.println("In Tamil Movie");
	}
	void movie(int c)
	{
		System.out.println("In  Movie");
	}
	
	
}
public class Hybrid_Inheritance extends  A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybrid_Inheritance h= new Hybrid_Inheritance();
		h.movie();
		h.movie(9);
		h.movie1();
		h.movie2();
	
		D d = new D();
		d.movie3();
	
	}

}
