package package1;
//Case3, Outside the package by becoming sub class

import package2.Teacher_Day26_a; // or import package2.*

public class Student2_Day26 extends Teacher_Day26_a 
{

	public static void main(String[] args) 
	{
	// Teacher_Day26_a t1=new Teacher_Day26_a (); we can not create object of parent
		Student2_Day26 s1=new Student2_Day26();
		
		s1.add(); //public
		s1.sub(); // protected
	
		
	}

}
