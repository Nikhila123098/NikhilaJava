package coreJavaToken;

public class AreaofCircle {
	final double pi=3.14;
	
	void area() {
		int r=7;
		double area=pi*r*r;
		System.out.println("Area of circle:" +area);

	}
	 void rectangle()
	 {
		 int l=12;
		 int b=12;
		 int area=l*b;
			System.out.println("Area of rectangle:" +area);
		 
	 }

	 void square()
	 {
		 int a=10;
		 int area=a*a;
			System.out.println("Area of square:" +area);
		 
	 }
	 
	 void triangle()
	 {
		 int b=10;
		 int h=12;
		 double area=0.5*b*h;
			System.out.println("Area of triangle:" +area);
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaofCircle a=new AreaofCircle();
		a.area();
		a.rectangle();
		a.square();
		a.triangle();
	}

}
