package Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] name = new String[3];
 name[0]="Ram";
 name[1]="Laksh";
 name[2]="Sita";
 
 int[] age = new int[3];
 age[0]=12;
 age[1]=23;
 age[2]=24;
  char[] gender= new char[3];
  gender[0]='F';
  gender[1]='M';
  gender[2]='M';
  for(int i=0;i<3;i++)
  {
	  System.out.println(name[i]);
	  System.out.println(age[i]);
	  System.out.println(gender[i]);

	  
  }
  System.out.println("================");

  for(int i=0;i<3;i++)
  {
	  System.out.print(name[i]+" ");
   }
  System.out.println(" ");

  for(int i=0;i<3;i++)
	  
  {

	  System.out.print(age[i]+" ");
  }
  System.out.println(" ");

  for(int i=0;i<3;i++)
  {
	  System.out.print(gender[i]+" ");


	  
	  }
  System.out.println(" ");


  System.out.println("================");

  for(int i=0;i<3;i++)
  {
	 System.out.println(name[i]+" "+age[i]+" "+gender[i]);
	// System.out.print(name[i]+" "+age[i]+" "+gender[i]);
	 //System.out.print(name[i]);
  }
  
  System.out.println(" ");


  System.out.println("================");

  for(int i=0;i<3;i++)
  {
	  System.out.print(name[i]);
   }
  System.out.print(" ");

for(int i=0;i<3;i++)
  {
	  System.out.print(age[i]);
	  }

  System.out.println(" ");


  System.out.println("================");

  
	}

}
