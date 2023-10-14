package StringFuncs;

public class SplitString {

	public static void main(String[] args) {
String s="Manish Kumar Tiwari";
String S1=s.substring(0,6);
String S2=s.substring(7, 12);
String S3=s.substring(13, 19);
String A1="MANISH";
String A2="Abhishek";
String A3=A1.concat(A2);
char S4=S1.charAt(0);
char S5=S2.charAt(0);
char S6=S3.charAt(0);

String A4="Manish";
//char A23=A4.charAt(2);
String A11=A1.substring(0,2);
//System.out.println(A11);//MA
String A10=A2.substring(0,2);
//System.out.println(A10);//Ab
String A91=A11.concat(A10);
//System.out.println(A91);
//String B1=A4.substring(2,4);
//System.out.println(B1);	

String B2=A1.substring(2,3);
String B01=B2.toUpperCase();
//System.out.println("String"+B01);

String B3=A91.concat(B01);
//System.out.println(B3);	// Maabn
String B4=A2.substring(3,4);
//System.out.println(B4);	//i
String S23=B3.concat(B4);
//System.out.println("S23:"+S23);	//i


String B5=A1.substring(3,5);
String B6=S23.concat(B5);
//System.out.println("B6:"+B6);	
String B7=A1.substring(4,6);
String B8=A2.substring(4,6);
String B9=B6.concat(B8);
//System.out.println("B9:"+B9);	// MAAbNi

String C1=A1.substring(5);
//System.out.println(C1);
String S22=B9.concat(C1);
//System.out.println(S22);


String C2=A2.substring(6);
//.out.println(C2);
String C3=B9.concat(C1).concat(C2);
System.out.println(C3);	








/*String A5=A4.substring(2,3);
String A6=A5.toUpperCase();
String A9=A4.replace(A5, A6);
System.out.println(S1);
System.out.println(S2);
System.out.println(S3);
System.out.println(S4);
System.out.println(S5);
System.out.println(S6);
System.out.print(S4);
System.out.print(S5);
System.out.print(S6);
System.out.println("");

System.out.println(A3);
System.out.println(A9);*/




	}

}
