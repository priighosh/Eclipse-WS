package notes2;// Case5
// class type casting, Up- C1 to C3, down C2 to C1, to do down-casting first we have to do up-casting C1 to C2
class Tiger //C3
{
	void Tig()
	{
		System.out.println("Tiger");
	}
}
class Lion extends Tiger //C2
{
	void Lio()
	{
		System.out.println("Lion");
	}
}
public class Day31_Case5 extends Lion //C1
{
	void Dog1()
	{
		System.out.println("Dog");
	}
    public static void main(String[] args) 
	{   
    	//Up-casting, C1 to C3
    	Tiger t1=new Day31_Case5();
    	t1.Tig();
    	//To down-cast from C2 to C1 we have to first up-caste C1 to C2
    	Lion l1=new Day31_Case5(); //Up-casting
    	l1.Lio();
    	l1.Tig();
    	//Down-casting 
    	Day31_Case5 d1=(Day31_Case5) l1;
    	d1.Lio();
    	d1.Dog1();
    	d1.Tig();

	}

}
