package coreJavaToken;

public class methodOverloading {

	static void add(int x)
	{
		System.out.println("Add");
		}
	void add(double x)
	{
		System.out.println("AddinParamaters");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading mo=new methodOverloading();
		add(1);
		mo.add(1.1);

	}

}
