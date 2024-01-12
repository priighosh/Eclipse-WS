package array_prog;//Day22
//How to assign values to Arrays, String and int
public class Prog1_arrayDay22 
{

	public static void main(String[] args) 
	{  
		String name[]=new String [3];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Vishnu";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		/*for(int i=0;i<=2;i++)
		{
			System.out.println(name[0]);
		}*/
			for(int i=0;i<=2;i++)
			{
				System.out.println(name[i]);
		    }
		int age[]=new int[4];
        age[0]=51;
        age[1]=31;
        age[2]=41;
        age[3]=61;
        for(int i=0;i<=3;i++)
        {
        	System.out.println(age[i]);
        }
	}
}
