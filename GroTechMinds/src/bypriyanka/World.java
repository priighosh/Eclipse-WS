package bypriyanka;
public class World 
{
    static void country1() // static method
    {
    	System.out.println("South Africa"); 
    }
    void country2() // non static
    {
    	System.out.println("Denmark");
    }
    void country3() // non static
    {
    	System.out.println("West indies");
    }
    World() // constructor
    {
    	System.out.println("India");
    }
 public static void main(String[] args) // static 
{
	country1(); // calling static method
	World w1=new World();  // creating object,reference variable is w1 / 1st Syntax,constructor will be called automatically
	w1.country2();  // calling non static method
	w1.country2();
	w1.country2();
	w1.country2(); // whichever method you want to call first you can,static/non static
	w1.country3(); // we are calling multiple non static method with same reference variable
    World w2=new World();
    w2.country3(); // creating another object for another non static method is possible, not recommended
    new World(); // 2nd syntax if there's only constructor present no non static method
}
}

