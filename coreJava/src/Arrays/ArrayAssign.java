package Arrays;

public class ArrayAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] City=new String[4];
		City[0]="Chennai";
		City[1]="Kerala";
		City[2]="Delhi";
		City[3]="Mumbai";
		
		Boolean[] Ans=new Boolean[4];
		Ans[0]=true;
		Ans[1]=false;
		Ans[2]=true;
		Ans[3]=false;

		
		String[] Message =new String[4];
		Message[0]="I have been there";
		Message[1]="I will visit soon";
		Message[2]="I have been there";
		Message[3]="I will visit soon";

		for(int i=0;i<4;i++)
		  {
			
			  System.out.print(City[i]);
			  System.out.print(" ");
			  System.out.print(Ans[i]);
			  System.out.print(" ");
			  System.out.print(Message[i]);
			  System.out.println("");

			  

			  
		  }

	}

}
