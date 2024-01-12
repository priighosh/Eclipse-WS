package assignments;//Assign36
class Town
{
	void square()
	{
		System.out.println("square");
	}
}
class Village extends Town
{
	void root()
	{
		System.out.println("root");
	}
}
class Home extends Village
{
	void power()
	{
		System.out.println("power");
	}
}
public class Assign36 
{
    public static void main(String[] args) 
	{
		Town t1=new Home();
		t1.square();
	
	    Home h1=(Home) t1;
	    h1.square();
	    h1.root();
	    h1.power();
	}

}
