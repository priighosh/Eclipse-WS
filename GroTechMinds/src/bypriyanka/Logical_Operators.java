package bypriyanka;
public class Logical_Operators 
{
    public static void main(String[] args)
    {
     int age =10;
     int salary=1000;
     
     if (age>25 || salary>20000)
     {
    	 System.out.println("Student1");
     }
     if (!(age>25 || salary>20000))
     {
    	 System.out.println("Student2");
     }
     if (!(age>25 && salary>20000))
     {
    	 System.out.println("Student3");
     }
     if (age>25 && salary>20000)
     {
    	 System.out.println("Student4");
     }
     if (age>5 && salary==500)
     {
    	 System.out.println("Student5");
     }
	}
}
