package notes2; //Day31, CASE-3
//Class type casting, C1 to C3,Up & Down
class One1   //C3
{
	void M1()
	{
		System.out.println("M1");
	}
}
class Two2 extends One1 //C2
{
	void M2()
	{
		System.out.println("M2");
	}
}
public class Day31_Case3 extends Two2 //C1
{
	void M3()
	{
		System.out.println("M3");
	}
    public static void main(String[] args) 
    {   
    	//Up-casting
    	One1 o1=new Day31_Case3();
    	o1.M1();
    	//Down-casting
    	Day31_Case3 d1=(Day31_Case3) o1;
    	d1.M1();
    	d1.M2();
        d1.M3();
	}

}
