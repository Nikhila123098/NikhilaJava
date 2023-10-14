package Arrays;

public class ReturnKey {
 public int add(int a,int b)
 {
	 int c= a+b;
	 return c;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnKey rk = new ReturnKey();
		rk.add(0, 0);
		System.out.println(rk.add(3, 2));
	}

}
