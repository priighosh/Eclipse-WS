package notes2;//Day30b & Day31, Class type-casting, Up-casting,Down-casting
//Case1- converting sub class object to super class, C2 to C1 Up & Down
class India //C1
{
	void NH()
	{
		System.out.println("1");
	}
	void SH()
	{
		System.out.println("2");
	}
	static void RW(int a)
	{
		System.out.println("with para");
	}
}
public class Day30_b extends India //C2
{
	void add()
	{
		System.out.println("3");
	}
    public static void main(String[] args)
    {
/*	India i1=new Day30_b(); //Implicit way converting sub class object to super class
	India i2=(India) new Day30_b();//Explicit
	i1.NH();
	i1.SH();
	RW(12); // Static
	i2.NH();
	i2.SH();
	RW(45);// Static
	// i2.add(); not able to call because using up-casting we have restricted access to only parent class
	Day30_b d1=new Day30_b(); // calling child by creating it's own object is possible
	d1.add();*/
    	India i1=new Day30_b(); //Up-casting
    	Day30_b d1	=(Day30_b)	i1;// Down-casting, converting super class object to sub-class
    	d1.add();
    	d1.NH();
    	d1.SH();
    	RW(12); // Static method called directly
    						
	}

}
