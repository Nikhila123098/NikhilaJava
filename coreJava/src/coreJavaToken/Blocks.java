package coreJavaToken;

public class Blocks {
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
	
		new Blocks();
		System.out.println("Inside Main");
		new Blocks();
	}
static
{

	System.out.println("Inside Static1");
}

static
{

	System.out.println("Inside Static2");
}
}
