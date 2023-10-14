package StringFuncs;

import java.util.Date;

public class StringAssign{
	public static void main(String Args[])
	{
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		Date d2=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d2);//epoch time converted
		
		String FormatDate=d2.toString();
	int length=	FormatDate.length();
	System.out.println(length);
	String Year=FormatDate.substring(24);
	System.out.println(Year);
	String Month=FormatDate.substring(4,7);
	System.out.println(Month);
	String date=FormatDate.substring(8,10);
	System.out.println(date);
	String format1=date.concat(Month).concat(Year);
	System.out.println(format1);
	String format2=date.concat(" ").concat(Month).concat(" ").concat(Year);
	System.out.println(format2);
	String format3=date.concat("-").concat(Month).concat("-").concat(Year);
	System.out.println(format3);
	


	



		

	}
}