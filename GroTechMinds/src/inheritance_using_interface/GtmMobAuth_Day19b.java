package inheritance_using_interface; //Day19b
// single level. C->I
interface GoogleAuth // interface can have only abstract method that's why we aren't writing abstract in-front 
{
	void un(); // for 3rd party company 
}
public class GtmMobAuth_Day19b implements GoogleAuth // to inherit interface we use implements
{
    public static void main(String[] args)
	{
    	GtmMobAuth_Day19b g1=new GtmMobAuth_Day19b();
    	g1.un();
	}
	public void un()
	{
		System.out.println("Logic of abstract method un"); // Hidden 
	}
}
