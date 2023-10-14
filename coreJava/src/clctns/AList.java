package clctns;

import java.util.ArrayList;
import java.util.Collections;

public class AList{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		al.add("Nikhila");
		al.add(30);
		al.add('F');
		al.add(5.6);
		al.add(30);
		al.add("Nikhila");
		al.add(30);
		al.add("Nikhila");

		System.out.println(al);
		
		ArrayList al1= new ArrayList();
		al1.add(12);
		al1.add(1);
		al1.add(123);
		al1.add(89);
		al1.add(12);
		Collections.sort(al1);
		System.out.println(al1);
		

		
	}
}