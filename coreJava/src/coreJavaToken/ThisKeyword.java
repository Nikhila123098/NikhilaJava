package coreJavaToken;

public class ThisKeyword {
int myage;
String name;
double weight;
 void studentinfo(int age,String name,double weight)
 {
	 this.myage=age;
	 this.name=name;
	 this.weight=weight;
	 System.out.print("Hello\n");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword t =new ThisKeyword();
		t.studentinfo(21, "NIKI", 90.2);
		System.out.println(t.myage);//default values printed without this keyword
		System.out.println(t.name);
		System.out.println(t.weight);

	}

}
