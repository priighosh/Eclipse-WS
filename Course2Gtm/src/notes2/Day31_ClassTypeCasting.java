package notes2;//Day31
//Case2, Up-casting and down-casting , Class3 to class2
class One
{
void Method1()
{
	System.out.println("1");
}
}
class Two extends One
{
	void Method2()
	{
		System.out.println("2");
	}
}
public class Day31_ClassTypeCasting extends Two
{
	void Method3()
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		Two t1=new Day31_ClassTypeCasting();
		t1.Method2();
	    t1.Method1(); //accessible because up casted two parent2,anything up is accessible
		Day31_ClassTypeCasting d1=(Day31_ClassTypeCasting) t1;
		d1.Method1();
		d1.Method2();
		d1.Method3();
	}
}
