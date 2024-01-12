package array_prog;// Assign23, Create a table of name, age and Email of 3 people

public class Assign23_array 
{
    public static void main(String[] args) 
	{
      String name []=new String[3];
      name[0]="Priyank";
      name[1]="Shalini";
      name[2]="Anusree";
      
      int Age []=new int[3];
      Age[0]=4;
      Age[1]=6;
      Age[2]=7;
      
      int MobNo []=new int[3];
      MobNo[0]=9474;
      MobNo[1]=6747;
      MobNo[2]=9871;
      
      String Email []=new String[3];
      Email[0]="p@gm.com";
      Email[1]="s@gm.com";
      Email[2]="a@gm.com";
      System.out.println("Name"+" "+"   Age"+" "+"MobNo"+" Email i'd");
      for (int i=0;i<=2;i++)
      {
    	 System.out.println(name[i]+"  "+Age[i]+"  "+MobNo[i]+"   "+Email[i]); 
      }
	}
}
