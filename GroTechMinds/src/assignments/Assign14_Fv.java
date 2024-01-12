package assignments;
// Create final variable and try to update its value
public class Assign14_Fv 
{   
	void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
    public static void main(String[] args) 
	{
        Assign14_Fv a1=new Assign14_Fv();
        a1.sub();
        final int daysinyear;  // final local variable
        daysinyear=365;
        System.out.println(daysinyear);
      //  daysinyear=366;        values can not get updated because it is final,Compilation error
        System.out.println(daysinyear);
       
    }
}
