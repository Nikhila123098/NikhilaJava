package Exception;
class four{
	void fourM()
	{
		System.out.println("Inside Four");
	}
}
class three extends four{
	void threeM()
	{
		System.out.println("Inside Three");
	}
}
class two extends three{
	void twoM()
	{
		System.out.println("Inside Two");
	}
}
public class Onecast extends two {
	void OneCast()
	{
		System.out.println("Inside One");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        three t1=new two();
        t1.fourM();
        t1.threeM();
        two t =new Onecast();//Upcasting done for downcasting
        Onecast O=(Onecast)t;//Downcasting
        O.fourM();
        O.threeM();
        O.twoM();
        O.OneCast();
        
        
	}

}
