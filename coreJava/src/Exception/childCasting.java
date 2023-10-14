package Exception;
class grandfather12{
	
	void gf2()
	{
		System.out.println("InGF2");
	}
	
}
class Parent extends grandfather12{
	void Parent1()
	{
		System.out.println("In Parent");
	}
	
}
public class childCasting extends Parent {
	void childCasting1()
	{
		System.out.println("In Child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*grandfather12 gf= new Parent();
		gf.gf2();
		Parent P=(Parent)gf;
		P.Parent1();
		P.gf2();*///once downcasted below mthods cant be accessed
		
		
 Parent p=new childCasting();
 p.gf2();
 p.Parent1();
 childCasting c=(childCasting)p;
 c.childCasting1();
 c.Parent1();
 c.gf2();
	}

}
