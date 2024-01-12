package assignments;

public class Assign9_LO /* Check if name is Ram,Gender is M print Student1. 
                           If name is Sita, Gender is F print Student2 */
{
    public static void main(String[] args) 
    {
	 String Name1="Ram"; char Gender1='M';
	 String Name2="Sita"; char Gender2='F';
	
     if (Name1=="Ram" && Gender1=='M')
     {
    	 System.out.println("Student1");
     }
     if(Name2=="Sita" && Gender2=='F')
     {
    	 System.out.println("Student2");
     }
}
}