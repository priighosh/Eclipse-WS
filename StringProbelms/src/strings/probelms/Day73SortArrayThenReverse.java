package strings.probelms;//Practice
//NOT working with int values for desc
//Sort String and int values in Asc and reverse order means Desc 
import java.util.Arrays;
import java.util.Collections;

public class Day73SortArrayThenReverse {

	public static void main(String[] args)
	{
		String name[]= {"Ram","Laxman","Sita","Vishnu"};
		Arrays.sort(name);	
		System.out.println(Arrays.toString(name));  //Asc
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println(Arrays.toString(name)); //Desc
		
		//For int Data type values these process not working, for that we need to do it in collection program(collection table problems we have done)
		int num[]= {18,10,45,15};
       // Arrays.sort(num);
        String b=Arrays.toString(num);
        System.out.println(b); //Asc
//        Collections.reverse(num);
//        Arrays.sort(num,);
        
        
	}

}
