package assignments;

public class Assgn2Arithmatic  // Create 5 methods and call them
{
    static void add()  // all static method, 1 main method. Total 5 methods
    {
    	int no1=10;
    	int no2=20;
    	int result=no1+no2;
        System.out.println(result);	
    }
    static void substract()
    {
    	int no1=10;
    	int no2=20;
    	int result=no1-no2;
        System.out.println(result);		
    }
    static void multiply()
    {
    	int no1=10;
    	int no2=20;
    	int result=no1*no2;
        System.out.println(result);	
    }
    static void divide()
    {
    	int no1=10;
    	int no2=20;
    	double result=no1/no2;
    	System.out.println(result);		
    }
	public static void main(String[] args) 
	{
		System.out.println ("Output will start from here");
		add();
		substract();
		multiply();
		divide();
		
	}

}
