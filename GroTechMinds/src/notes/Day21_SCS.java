package notes; //SCS
//Day21,p1,2,3,4= In child no constructor is present and no relation is created in child
class CrossKt
{
	CrossKt()
	{
		System.out.println("Cross KT");
	}
}
class Mentor_1 extends CrossKt
{
	Mentor_1(int a,double b)
	{
		System.out.println("Mentor is for doubt clarification");
	}
}
class Student1 extends Mentor_1
{
	Student1(int a)
	{   super(100,2.45);
		System.out.println("Students are workinh hard");
	}
}
public class Day21_SCS 
{

	public static void main(String[] args) 
	{
		new Student1(0); // it will call Student1 class constructor which has a SCS present at 1st line
                         // So that will go and call Mentor_1's constructor since they have relation between them
	}          // Mentor_1's 1st line has a SCS present at 1st line  implicitly, that will call CrossKt class
}
