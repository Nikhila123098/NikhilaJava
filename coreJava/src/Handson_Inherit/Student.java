package Handson_Inherit;

public class Student extends Teacher{
void java()
{
	System.out.println("Learning Java");
}

void selenium()
{
	System.out.println("Learning Selenium");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.java();
s.selenium();
s.Teachingjava();
s.Teachingselenium();
	}

}
