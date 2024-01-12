package notes2;
//Primitive type casting, 
//What we are converting has to be on the right hand side
public class Day30_a 
{
    	public static void main(String[] args) 
	{
    		double weight			=85; //Implicit,converting int 85 to double , WIDENING,  
    		System.out.println(weight); // without declaring separately in 1st line as int weight =85
    		
    		//In explicit syntax we write converted data type on the right hand side 
    		int person1=60;
    		double weight1=(double)		person1; //explicit syntax, int person1 to double, Widening
    		System.out.println(weight1);
    		
    		int myweight=(int)		85.67; //explicit, double myweight to int, Narrowing
    		System.out.println(myweight);
    		
    	    double a=987.875; //Double to short, Narrowing
    	    short a1=	(short)		a; //Explicit,
    		System.out.println(a1);
    }

}
