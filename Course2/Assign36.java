package assignments;//Assign36, Up-casting & down-casting, C3 to C1 
class Town //C1
{
	void square()
	{
		System.out.println("square");
	}
}
class Village extends Town //C2
{
	void root()
	{
		System.out.println("root");
	}
}
class Home extends Village //C3
{
	void power()
	{
		System.out.println("power");
	}
}
public class Assign36 //C4
{
	void cube()
	{
		System.out.println("cube");
	}
    public static void main(String[] args) 
	{
		Town t1=new Home(); //Up-casting
		t1.square();
	
	    Home h1=(Home) t1; //Down-casting
	    h1.square();
	    h1.root();
	    h1.power();
	    //C4 has no relation so to call its method create its own object
	    Assign36 a1=new Assign36();
	    a1.cube();
	    
	}

}
