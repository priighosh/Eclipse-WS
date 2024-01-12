package array_prog; //Day22,this Key-word
// Use this keyword to assign local values to global variables
public class Kw_this_Day22
{   
	int age;
	String name;
	double salary;
	void MyDetails(int age,String name,double salary) //Can only be used in Non static & Constructor
	{
		this.age=age;
		this.name=name;
		// this.salary=salary;
		System.out.println("My Details"); 
	}
    public static void main(String[] args) 
	{
    	Kw_this_Day22 k1=new Kw_this_Day22();
    	k1.MyDetails(21,"Prii", 45555.0);
    	System.out.println(k1.age);
    	System.out.println(k1.name);
    	System.out.println(k1.salary);
    	
    	Kw_this_Day22 k2=new Kw_this_Day22();
    	k2.MyDetails(29,"Ram", 65555.0);
    	System.out.println(k2.age);
    	System.out.println(k2.name);
    	System.out.println(k2.salary);
	}
}
