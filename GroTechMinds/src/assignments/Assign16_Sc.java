package assignments;

import java.util.Scanner;

/* WAP to create 4 methods other than main method, add, sub, 
multiplication, division using scanner class locally */
public class Assign16_Sc  
{
    /*we have to use different reference variable to avoid duplicacy in case of same method, under main method
	we have created all 4 operations,no separate method*/
	public static void main(String[] args) 
	{
     Scanner s1=new Scanner(System.in);
     System.out.println("Enter no1");
     int no1= s1.nextInt();           // storing the value of no1 in int 
     System.out.println("Enter no2");
     int no2= s1.nextInt();
     System.out.println("Addition");
     int result1= no1+no2;          // Logic
     System.out.println(result1);  
     
     Scanner s2=new Scanner(System.in);  
     System.out.println("Enter no3");
     int no3= s2.nextInt();
     System.out.println("Enter no4");
     int no4= s2.nextInt();
     System.out.println("Subtraction");
     int result2= no3-no4;
     System.out.println(result2);
     
     Scanner s3=new Scanner(System.in);
     System.out.println("Enter no1");
     int no5= s3.nextInt();
     System.out.println("Enter no2");
     int no6= s3.nextInt();
     System.out.println("Multiplication");
     int result3= no5*no6;
     System.out.println(result3);
     
     Scanner s4=new Scanner(System.in);
     System.out.println("Enter no1");
     int no7= s4.nextInt();
     System.out.println("Enter no2");
     int no8= s4.nextInt();
     System.out.println("Division");
     int result4= no7/no8;
     System.out.println(result4);
     s1.close();
     s2.close();
     s3.close();
     s4.close();
     }
}
