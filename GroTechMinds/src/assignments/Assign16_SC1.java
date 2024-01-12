package assignments;
// WAP to create 4 methods other than main method, add, sub,
  
//multiplication, division using scanner class locally,leakage issue will come so do it again globally 
// CORRECT ONE ACCORDING TO THE QUSTION
import java.util.Scanner;
/*We can use same reference variable because methods are different, so no duplicacy
Declaring Scanner ref variable to stop writing Scanner s1=new Scanner(System.in) & to avoid closing or leakage*/
public class Assign16_SC1 
{    
	 static Scanner s1; //Declaring s1 globally
     public static void main(String[] args)
	 {
	  add();
      sub();
      mult();
      div();
	 }
	 static void add()
	 {
	 s1=new Scanner(System.in);
	 System.out.println("Enter no1");
     int no1= s1.nextInt();           // storing the value of no1 in int 
     System.out.println("Enter no2");
     int no2= s1.nextInt();
     System.out.println("Addition");
     int result1= no1+no2;          // Logic
     System.out.println(result1);
     }
     static void sub()
     {
     s1=new Scanner(System.in);
     System.out.println("Enter no3");
     int no3= s1.nextInt();
     System.out.println("Enter no4");
     int no4= s1.nextInt();
     System.out.println("Subtraction");
     int result2= no3-no4;
     System.out.println(result2);
     }
    static void mult()
     {
     s1=new Scanner(System.in);
     System.out.println("Enter no1");
     int no5= s1.nextInt();
     System.out.println("Enter no2");
     int no6= s1.nextInt();
     System.out.println("Multiplication");
     int result3= no5*no6;
     System.out.println(result3);
     }
     static void div()
     {
     s1=new Scanner(System.in);
     System.out.println("Enter no1");
     int no7= s1.nextInt();
     System.out.println("Enter no2");
     int no8= s1.nextInt();
     System.out.println("Division");
     int result4= no7/no8;
     System.out.println(result4);
     }
}

