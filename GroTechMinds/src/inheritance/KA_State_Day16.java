package inheritance; // Day16-prog1 , Single level inheritance
//2 non static in parent and 1static in child, in same program and call them inside main method
class IND_Country // Super class//Parent
{
	void NH_highway()
	{
	System.out.println("NH_highway");	
	}
	void CT_Hospital()
	{
		System.out.println("CT_Hospital");
	}
}
public class KA_State_Day16 extends IND_Country //Sub class/child
{
    static void statehighway()
    {
    	System.out.println("statehighway");
    }
    public static void main(String[] args)
    {
    	statehighway();
    	KA_State_Day16 k1=new KA_State_Day16();
    	k1.CT_Hospital();
    	k1.NH_highway();
	}
}
