package array_prog;// Assign24,DAY23, Array, did it better in another prog
public class Assign24_Day23 
{
    public static void main(String[] args)
	{
      String Student1[]=new String[1];
      Student1[0]="Name1";
      int Age1[]=new int[1];
      Age1[0]=4;
      int MobNo1[]=new int[1];
      MobNo1[0]=9474;
      String Email1[]=new String[1];
      Email1[0]="n1@gm.com";
      System.out.println("Student1"); // Line by line execution
      
      String Details2[]=new String[1];
      Details2[0]="Student2";
      String Student2[]=new String[1];
      Student2[0]="Name2";
      int Age2[]=new int[1];
      Age2[0]=8;
      int MobNo2[]=new int[1];
      MobNo2[0]=4524;
      String Email2[]=new String[1];
      Email2[0]="n2@gm.com";
      
      String Details3[]=new String[1];
      Details3[0]="Student3";
      String Student3[]=new String[1];
      Student3[0]="Name3";
      int Age3[]=new int[1];
      Age3[0]=12;
      int MobNo3[]=new int[1];
      MobNo3[0]=1234;
      String Email3[]=new String[1];
      Email3[0]="n3@gm.com";
     
      for(int i=0;i<1;i++)
      {
          System.out.println("Name:"+ Student1[i]);
          System.out.println("Age:"+ Age1[i]);
    	  System.out.println("Mob No:"+ MobNo1[i]);
    	  System.out.println("Email:"+ Email1[i]);
    	  System.out.println(Details2[i]);     // Line by line execution
    	  System.out.println("Name:"+ Student2[i]);
    	  System.out.println("Age:"+ Age2[i]);
    	  System.out.println("Mob No:"+ MobNo2[i]);
    	  System.out.println("Email:"+ Email2[i]);
    	  System.out.println(Details3[i]);
    	  System.out.println("Name:"+ Student3[i]);
    	  System.out.println("Age:"+ Age3[i]);
    	  System.out.println("Mob No:"+ MobNo3[i]);
    	  System.out.println("Email:"+ Email3[i]);
      }
    }
}
