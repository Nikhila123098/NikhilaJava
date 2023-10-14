package coreJavaToken;

public class constructorExample {
	constructorExample(){
		System.out.println("Inside Constructor");
	}
	
	public static void main(String args[])
	{
		new constructorExample();//Alternate method to create object only when constructor needs to be called
		
		//constructorExample conex=new constructorExample();
		System.out.println("Inside MAin");
		new constructorExample();

	}

}
