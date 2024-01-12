package assignments;
// Guess the output
public class Assign7_ForLoopGTO
{
    public static void main(String[] args) 
	{
        int i=0;
        for(i=2;i<0;i++)//Last updated value of i=2,so 2 will be printed(in class5 learned it.)if condition is true
        {
           System.out.println("Your Name"); // condition is false so nothing will be printed
        }
           System.out.println(i); // i value itself getting printed because under main method "print i" is there.
	}
}
