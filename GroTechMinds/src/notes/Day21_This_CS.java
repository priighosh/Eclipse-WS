package notes;
//Day21, Prog5,6, This calling statement=used to call 1 constructor from another
//Inside main method by creating 1 object of 1 constructor we can call all the 
//constructors from same class
public class Day21_This_CS
{   
	 Day21_This_CS(int a) //1st cons
	 {  
		 this(); // it will call const3
		System.out.println("Const1"); 
	 }
	 Day21_This_CS(double b) // 2nd cons
	 {   
		 this(11);
		 System.out.println("Const2"); 
	 }
	 Day21_This_CS() //3rd cons
	 {
		 System.out.println("Const3");
	 }
	public static void main(String[] args) 
	{
		new Day21_This_CS(2.48); // creating an object for 2nd cons
                      // inside 2nd this CS is present so it is calling const1
	}

}
