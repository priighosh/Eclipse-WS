package notes;
// Method overriding Day17, Parent will be overridden always
class Addition //Parent
{
	void add()
	{
		System.out.println("addition of 3 no");
	}
}
public class ArithmeticOperator_Day17 extends Addition // Child
{
	void add()
	{
		System.out.println("addition of 2 no");
	}
    public static void main(String[] args) 
    {
    	ArithmeticOperator_Day17 a1=new ArithmeticOperator_Day17();
    	a1.add(); // when we are typing a1.add auto suggestion only showing child class' method
    	a1.add(); //when we are typing a1.add auto suggestion only showing child class' method
                  // So parent got overridden
	}

}
