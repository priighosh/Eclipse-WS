package strings.probelms; 
//Find out the Array or sort the Array in Descending order
//First do Ascending then Reverse order
import java.util.Arrays;
import java.util.Collections;

public class Day73SortArrayDescendingOrder 
{
public static void main(String[] args) 
{
	String name[]= {"Ram","Laxman","Sita","Vishnu"};
	Arrays.sort(name);	
	System.out.println(Arrays.toString(name));
	Arrays.sort(name, Collections.reverseOrder());
	System.out.println(Arrays.toString(name));
	
}
}
