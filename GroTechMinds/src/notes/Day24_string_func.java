package notes;//Day24
//8 String functions
public class Day24_string_func 
{
    public static void main(String[] args)
	{
		String s="India";
		s.length(); // 1st string function
		String b="Priyanka Ghosh";
		String d="Australia";
		System.out.println( s.length());
        s.charAt(2); // Find character at index position...
        System.out.println( s.charAt(2)); //2nd
        System.out.println( s.indexOf('d'));// Find index of char 'i' //3rd
        System.out.println( b.toUpperCase()); //4th
        System.out.println(b.toLowerCase());//5th
        System.out.println(s.toLowerCase());
        System.out.println(b.concat("hello")); //Concatenation/joining together //6th
        System.out.println(b.concat(" ").concat("hello")); //with space
        System.out.println(s.concat(b)); 
        System.out.println(s.concat(" ").concat(b)); //with space
        System.out.println(d.substring(2));// from origin till the end will be the OP, here origin is index2 //7th
        System.out.println(d.substring(1, 3));//with 2para,it will end 1 less than the indexing of the destination
	}                                         //8th
}
