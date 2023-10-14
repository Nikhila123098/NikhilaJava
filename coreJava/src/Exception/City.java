package Exception;

 class State{
	 void StateName()
	 {
			System.out.println("In StateName");
 
	 }
	 void StateRoad()
	 {
			System.out.println("In StateRoad");

	 }
 }

public class City extends State {
void cityName()
{
	System.out.println("In CityName");
}
void cityRoad()
{
	System.out.println("In CityRoad");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		State s1=new City();//Upcasting 
		s1.StateName();
		s1.StateRoad();
		
		City c1=(City) s1;//Downcasting
		c1.cityName();
		c1.cityRoad();
		c1.StateName();
		c1.StateRoad();
		
		
		

	}

}
