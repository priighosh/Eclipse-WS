package inheritance;
//Day16-Prog2, 1non static, 1 static in parent1 & 2, 1static inside child, total 4 methods including main method
class Country //P1
{
	void NH() // non static
	{
		System.out.println("NH");
	}
}
class State extends Country // P2
{
	static void State_hw() // static
	{
		System.out.println("State_hw");
	}
}
public class City_Day16 extends State //Child
{
    static void city_hw() //1 static
    {
    	System.out.println("city_hw");
    }
	public static void main(String[] args) //Main method
	{
		city_hw();
		State_hw();
		City_Day16 c1=new City_Day16();
		c1. NH();
		
	}

}
