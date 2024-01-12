package inheritance_using_interface; // DAY19d, Multiple Level Inheritance
/* I      I
   ^      ^
    \    /
     \  /
       C          */
interface Google_Auth
{
	void g_un();
	void g_pwd();
}
interface FacebookAuth
{
	void fb_un();
	void fb_pwd();
}
public class Gtm_Web_Day19d implements Google_Auth,FacebookAuth
{
    public static void main(String[] args) 
	{
    	Gtm_Web_Day19d g1=new Gtm_Web_Day19d();
    	g1.fb_un();
    	g1.fb_pwd();
    	g1.g_un();
    	g1.g_pwd();
	}
	public void fb_un()
	{
	   int c=12;
	   int d=12;
	   int result1=c-d;
	   System.out.println(result1);
	}
	public void fb_pwd() 
	{
	   	int e=15;
	   	int f=2;
	   	int result2=e*f;
	   	System.out.println(result2);
	}
	public void g_un() 
	{
	   	double g=17;
	   	double h=2;
	   	double result3=g/h;
	   	System.out.println(result3);
	}
	public void g_pwd()
	{
	    int a=10;
	    int b=20;
	    int result4=a+b;
	    System.out.println(result4);
	}
}
