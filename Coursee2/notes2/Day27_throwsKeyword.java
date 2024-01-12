package notes2;
//Day27,prog1,one throws can declare multiple exception
public class Day27_throwsKeyword 
{
    public static void main(String[] args) throws ArithmeticException, InterruptedException
    {
	 Thread.sleep(10000); //hover over to it and choose exception,this is giving Interrupted exception
	 throw new ArithmeticException("You are still young");
	
	

	}

}
