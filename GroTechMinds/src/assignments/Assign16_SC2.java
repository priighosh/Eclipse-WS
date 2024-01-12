package assignments;
// Replica of Assign16_Sc.
import java.util.Scanner;

public class Assign16_SC2
{       
        public static void main(String[] args) 
	    {   
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a");
		int a=s1.nextInt();
		System.out.println("Enter b");
		int b=s1.nextInt();
		System.out.println("Addition");
        int result1=a+b;
        System.out.println(result1);
        
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter c");
        int c=s2.nextInt();
        System.out.println("Enter d");
        int d=s2.nextInt();
        System.out.println("Subtraction");
        int result2=c-d;
        System.out.println(result2);
        
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter no1");
        int no1=s3.nextInt();
        System.out.println("Enter no2");
        int no2=s3.nextInt();
        System.out.println("Multiplication");
        int result3=no1*no2;
        System.out.println(result3);
        
        Scanner s4=new Scanner(System.in);
        System.out.println("Enter e");
        int e=s4.nextInt();
        System.out.println("Enter f");
        int f=s4.nextInt();
        System.out.println("Division");
        int result4=e/f;
        System.out.println(result4);
        s1.close();
        s2.close();
        s3.close();
        s4.close();
        }
}
