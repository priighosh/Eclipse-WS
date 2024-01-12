package array_prog;
// Print name & age together
public class Day23 
{
    public static void main(String[] args)
    { 
       String name[]=new String[4];
       name[0]="Ram";
       name[1]="Sita";
       name[2]="Vishnu";
       name[3]="Laxman";
       
       int age[]=new int[4];
       age[0]=21;
       age[1]=15;
       age[2]=30;
       age[3]=20;
       
       for (int i=0;i<4;i++)
      //for (int i=0;i<=3;i++) , Both works fine, write either 1
       {
    	  System.out.println(name[i]+" "+age[i]);
    	//System.out.println(name[i]+" "+age[i+1]); 
    	  
    /*It will print name [0] with age [0+1] and so on till Vishnu,after that it will show run time error
    	   because for laxman name[3] & age[4], there's no age[4].*/
       }
     }
}
