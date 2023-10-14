package Exception;
public class ExamQuestion7 

{  

    static int j; 

    static void methodA(int i)

    {

        boolean b; 

        do

        { 

            b = i<10 | methodB(4); /* Line 9 */

            b = i<10 || methodB(8); /* Line 10 */

        }while (!b); 

    } 

    static boolean methodB(int i)

    {

        j += i; 

        return true; 

    } 

   // public static void main(String[] args)

    {

        methodA(0); 

        System.out.println( "j = " + j ); 

    } 




public static void main(String args[])

{       

     int g = 3;

     System.out.print(++g * 8);

}
}


/*public class Test {  

public static void main(String[] args) {  

    int count = 1;  

    while (count <= 15) {  

    System.out.println(count % 2 == 1 ? "***" : "+++++");  

    ++count;  

        }      // end while  

    }       // end main   

 }  */