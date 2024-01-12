package assignments;// Day 25, Assign 26,27
// Using string functions print "My name is Ram" in reverse
public class Assign26_27 
{

	public static void main(String[] args) 
	{
	String s="My name is Ram";
	System.out.println(s.length());
	String s1=s.substring(0,2);
	System.out.println(s1);
	String s2=s.substring(3,7);
	System.out.println(s2);
	String s3=s.substring(8,10);
	System.out.println(s3);
	String s4=s.substring(11);
	System.out.println(s4);
	System.out.println(s4.concat(" ").concat(s3).concat(" ").concat(s2).concat(" ").concat(s1));
  
	}
}
