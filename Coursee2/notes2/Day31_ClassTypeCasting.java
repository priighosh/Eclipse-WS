package notes2;//Day31
//Case2, Up-casting and down-casting , Class1 to class2
class One //C3
{
    void Method1()
    {
	    System.out.println("1");
    }
}
class Two extends One //C2
{
	void Method2()
	{
		System.out.println("2");
	}
}
public class Day31_ClassTypeCasting extends Two //C1
{
	void Method3()
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{   //Up-casting
		Two t1=new Day31_ClassTypeCasting();
		t1.Method2();
	    t1.Method1(); //accessible because up casted to C2,anything up is accessible
	    //Down-casting, till C3 so nothing bellow C3 would be possible,top classes will be accessible
		Day31_ClassTypeCasting d1=(Day31_ClassTypeCasting) t1;
		d1.Method1();
		d1.Method2();
		d1.Method3();
	}
}
