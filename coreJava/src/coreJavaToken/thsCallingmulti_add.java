package coreJavaToken;

public class thsCallingmulti_add {
	thsCallingmulti_add(String a)
	{
		System.out.println("String Para");

	}
	thsCallingmulti_add(int a)
	{
		this("Nik");
		System.out.println("This Int Para");
	}
	
	thsCallingmulti_add(int a,int b)
	{
		this(4);
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new thsCallingmulti_add(10,20);
	}

}
