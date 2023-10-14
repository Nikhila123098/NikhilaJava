package coreJavaToken;

public class LocalGLobal {
int a;
double b=2.34;
static String c="Nik";

void method(int a,double b,String c)
{
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		LocalGLobal m1=new LocalGLobal();
		m1.method(1,2.4 ,"NIk");
		System.out.println(m1.a);
		System.out.println(c);
		
		
		

	}

}
