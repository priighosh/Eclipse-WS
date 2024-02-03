package notes2; // Public class, C1
//A-S for class=public=C1, C1 can access C2, they are in same package, C1 can not access Default class
public class Day26_AS_ForClass1 
{
    static void add()// 1
    {
    	System.out.println("addition"); // why I am unable to call it? A:because of Access specifier concept
    }
    public void sub()
    {
    	System.out.println("Subtraction");
    }
    void sub1()// why am I unable to call it inside Package 2 class3?A:because of Access specifier concept
    {
    	System.out.println("sub1");
    }
    
	public static void main(String[] args) 
	{
		add(); //1
		Day26_AS_ForClass2 d2=new Day26_AS_ForClass2();
		d2.arithmetic(); //C1 can access C2
		
		// unable to call "default" class from different package
//Day26_defaultClass d3=new Day26_defaultClass();//after writing this try to import the class from that package
	                                
		// d3.add1(); it is giving compilation error showing change the visibility of add1() method's 
		// class as public

	}

}
