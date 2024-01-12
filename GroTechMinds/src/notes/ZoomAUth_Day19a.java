package notes; //Day19a,Inheritance multi-level
//Assign19a, everything is done just call all the methods
// C->C'a->C'a (1child inheriting 1abstract class,that abstract class inheriting another abstract class)
//except child both have 2AM, 1SM,1NSM
abstract class GoogleAuth 
{                                                                  
	abstract void UN_Google();
	abstract void PW_Google();
	static void Login_Google()
	{
		System.out.println("Static 1,Login_Google");
	}
	void Otp_Google()
	{
		System.out.println("Non-Static 1,Otp_Google");
	}
}
abstract class FacebookAUth extends GoogleAuth
{
	abstract void UN_Fb();
	abstract void PW_Fb();
	static void Login_Fb()
	{
		System.out.println("Static 2 Login_FB");
	}
	void Otp_Fb()
	{
		System.out.println("Non-Static 2 Otp_FB");
	}
}
public class ZoomAUth_Day19a extends FacebookAUth //CHILD
{
    public static void main(String[] args) 
	{
    	System.out.println("FB & Google");
    	ZoomAUth_Day19a z1=new ZoomAUth_Day19a();
    	z1.UN_Fb();
    	z1.PW_Fb();
    	z1.UN_Google();
    	z1.PW_Google();
    	z1.Otp_Fb();
    	z1.Otp_Google();
    	Login_Fb();
    	Login_Google();
    }
    void UN_Fb()
	{
		System.out.println("abstrat FB_UN, Logic ");
	}
    void PW_Fb()
    {
	  System.out.println("abstract FB_PW, Logic");
	}
    void UN_Google() 
	{
      System.out.println("abstract G_UN, Logic");
	}
    void PW_Google()
    {
    	System.out.println("abstract G_PW, Logic");
	}
}
