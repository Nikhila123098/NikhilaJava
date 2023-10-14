package coreJavaToken;

public class conditionOperatorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=200;
int b=300;
int c=500;
if(a<b&&b<c)
{
	System.out.println("Inside first If");
	}
		
if(a<b||b>c)
{

	System.out.println("Inside Second If");
}
	if(!(a>b&&b>c)	)
	{

		System.out.println("Inside Third If");
	}
	if(!(a>b||b>c))
	{

		System.out.println("Inside fourth If");
	}
		
	}

}
