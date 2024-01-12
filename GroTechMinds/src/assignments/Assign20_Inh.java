package assignments;// Assign20
// C->C^a-C^a, Create a child and 2 Super class abstract in nature having 2AM in each, now add abstract class1's
// unimplemented methods to abstract class2 and keep the rest as it is,and execute the program.
abstract class Twitter
{
	abstract void Twt_un();
	abstract void Twt_pw();
}
abstract class LinkedIn extends Twitter
{
	abstract void LinkedIn_un();
	abstract void LinkedIn_pw();
	void Twt_un() 
	{
		System.out.println("Add Twitter username=@twitter");
	}
	void Twt_pw() 
	{
		System.out.println("Add Twitter password=456@Tw");
	}
}
public class Assign20_Inh extends LinkedIn
{
    public static void main(String[] args) 
    {
    	 Assign20_Inh a1=new  Assign20_Inh();
    	 a1.LinkedIn_un();
    	 a1.LinkedIn_pw();
    	 a1.Twt_un();
    	 a1.Twt_pw();
	}
	void LinkedIn_un()
	{
		System.out.println("Add LinkedIn username=@linkedin");
	}
	void LinkedIn_pw()
	{
		System.out.println("Add LinkedIn password=123@Li");
	}
}
