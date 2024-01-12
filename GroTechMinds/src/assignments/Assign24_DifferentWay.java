package assignments;//Assign24, Print 3 Student details vertically using array
//Array, Correct way
public class Assign24_DifferentWay 
{
    public static void main(String[] args) 
	{
		String Student[]=new String[3];
		Student[0]="Student1";
		Student[1]="Student2";
		Student[2]="Student3";
		
		String Name[]=new String[3];
	    Name[0]= "Name1";
	    Name[1]= "Name2";
	    Name[2]= "Name3";
	    
	    int Age[]=new int[3];
	    Age[0]=4;
	    Age[1]=6;
	    Age[2]=8;
	    
	    int MobNo[]=new int[3];
	    MobNo[0]=9474;
	    MobNo[1]=9474;
	    MobNo[2]=9474;
	    
	    String Email[]=new String[3];
	    Email[0]="N1@gmail.com";
	    Email[1]="N2@gmail.com";
	    Email[2]="N3@gmail.com";
	    
	    for (int i=0;i<=2;i++)
	    {
	    	System.out.println(Student[i]);
	    	System.out.println("Name:"+ Name[i]);
	    	System.out.println("Age:"+ Age[i]);
	    	System.out.println("MobNo:"+ MobNo[i]);
	    	System.out.println("Email:"+ Email[i]);
	    	System.out.println("  ");
	    }
	    

	}

}
