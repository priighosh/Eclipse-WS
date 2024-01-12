package inheritance_using_interface; // Day19c, Multi-Level inheritance
// C->C^a->I
interface InstagramAuth // 2 abstract methods
{
	void ui();
	void pw();
}
abstract class ThreadsAuth implements InstagramAuth //2AM,1SM,1NSM
{
	abstract void user_id();
	abstract void Pwd();
	static void Login_withOtp()
	{
		System.out.println("Static 1");
	}
	void login()
	{
		System.out.println("Non Static 1");
	}
}
public class GtmWebsite_Day19c extends ThreadsAuth //1SM,1NSM,1MM-Inside mm ,4 Overridden abstract methods
{
	static void Login_On_Web()
	{
		System.out.println("Static2");
	}
	void Login_after_reg()
	{
		System.out.println("Non Static2");
	}
    public static void main(String[] args) 
    {
    	 GtmWebsite_Day19c g1=new  GtmWebsite_Day19c();
    	 g1.ui();
    	 g1.pw();
    	 g1.user_id();
    	 g1.Pwd();
    	 g1.Login_after_reg();
    	 g1.login();
    	 Login_On_Web();
    	 Login_withOtp();
	}
	public void ui()
	{
		 int a=10;
		 int b=20;
		 int result1=a+b;
		 System.out.println(result1);
	}
	public void pw() 
	{
		int c=12;
		int d=12;
	    int result2=c-d;
		System.out.println(result2);
	}
	void user_id()
	{
		int e=15;
	   	int f=2;
	   	int result3=e*f;
	   	System.out.println(result3);
	}
	void Pwd()
	{
		double g=17;
	   	double h=2;
	   	double result4=g/h;
		System.out.println(result4);
	}
}
