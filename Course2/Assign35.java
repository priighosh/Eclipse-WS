package assignments;//Day30, Assign35
// Store a big value in long and try to convert it in byte,practically not possible because byte range is less
public class Assign35
{
    public static void main(String[] args) 
    {
		long mobNo= 73218797;
		byte mobNo1= (byte) mobNo;
		System.out.println(mobNo1);
		
		//Output is coming as -19 which is garbage value, we will learn later
		
		/*long no= 100;
		byte no1= (byte) no;
		System.out.println(no1);*/
		

	}

}
