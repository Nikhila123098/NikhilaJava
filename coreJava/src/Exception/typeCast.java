package Exception;

public class typeCast {

	public static void main(String[] args) {
 long l=900367891;
 byte b=(byte) l;//Widening-Explicit Way
 byte b1=23;
 long l1=b1;//Narrowing _Implicit way
 
 System.out.println(b);
 
 System.out.println(l1);

	}

}
