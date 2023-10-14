package coreJavaToken;

public class thisCallingstmnt {
	thisCallingstmnt()
	{
		this(3);
		System.out.println("NonPara");
		}
	thisCallingstmnt(int a){
		int b=a+6;
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new thisCallingstmnt();
	}

}
