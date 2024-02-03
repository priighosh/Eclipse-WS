package notes2; //Day34, prog2, Encapsulation
// Hiding variables of C2 from C1 and giving indirect access with set and get method
class StudentDetails //C2
{
	private String Email="n@gmail.com"; //Variable (global)=Email
	public void set_Email(String email) //Method , DATA MEMBERS= Variables+Methods of the class
	{
		this.Email= email; //Using this key-word assigning local value to global variable,  
		//where method para is same as global variable
		
	}
	public String get_Email()
	{
		return Email;
	}
}
public class Day34_Encapsulation //C1
{
    public static void main(String[] args) 
	{
    	StudentDetails s1=new StudentDetails();	
    	s1.set_Email("prii@gmail.com"); //calling set method
    	s1.get_Email(); //calling get
	
    	System.out.println(s1.get_Email()); //Calling & printing set together
	}
}
