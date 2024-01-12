package assignments;
// Size of the array is 3, try passing 4 values & handle the exception
public class Assign31 
{
    public static void main(String[] args) 
    {   
    	System.out.println("Size is 3,So for loop will give exception while putting more than 4 values");
		String name[]=new String [3];
		name[0]="Priyanka";
		name[1]="Shalini";
		name[2]="Anusree";
		try 
		{
			name[3]="Tiasha";
			name[4]="Prii";
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
		
			System.out.println("Handled exception,so now for loop will start executing");
		}
		
        for (int i=0;i<=2;i++)
        {
        	System.out.println(name[i]);
        }
	}

}
