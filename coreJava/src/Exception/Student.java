package Exception;

class Teacher
{
	void Teacher1()
	{
		 System.out.println("Inside Teacher");

	}
}
class Mentor extends Teacher
{
	void Mentor1()
	{
		 System.out.println("Inside Mentor");

	}
}
public class Student extends Mentor {
	void Student1()
	{
		 System.out.println("Inside Student");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Student();
		t.Teacher1();
		 Student S=(Student)t;
		 S.Student1();
		 S.Teacher1();

	}

}
