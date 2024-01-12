package assignments;//Day34, Assign43, ENCAPSULATION
class RegDetails
{
	private String un;
	private String pw;
	private long dob;
	public void set_UN(String UN)
	{
		this.un= UN;
	}
	public void set_PW(String PW)
	{
		this.pw=PW;
	}
	public void set_DOB(long DOB)
	{
		this.dob=DOB;
	}
	public String get_UN()
	{
		return un;
	}
	public String get_PW()
	{
		return pw;
	}
	public long get_DOB()
	{
		return dob;
	}
}
public class Assign43_Encapsulation
{
    public static void main(String[] args)
	{
    	 RegDetails r1=new  RegDetails();
    	 r1.set_UN("p@gmail.com");
    	 r1.set_PW("g@123");
    	 r1.set_DOB(26111993);
    	 
    	 System.out.println(r1.get_UN());
    	 System.out.println(r1.get_PW());
    	 System.out.println(r1.get_DOB());
	}

}
