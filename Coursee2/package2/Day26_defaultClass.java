package package2; // Different package default class
// default class, called it inside another class Day26_As_ForClass3 in same package
class Day26_defaultClass 
{
    void add1()
    {
    	System.out.println("print addition");
    }
    public static void pi()
    {
    	System.out.println("I am pi");
    }
	public static void main(String[] args) 
	{
		Day26_defaultClass d1=new Day26_defaultClass();
		d1.add1(); // calling it's own method

	}

}
