package notes;// Day24,Substring
// Print Priyanka is name My
public class Day24_Prog2_Substring 
{
    public static void main(String[] args)
	{
      String a="My name is Priyanka";//Size: 19, count index from 0
      int SizeOfString= a.length(); //Size of the string
      System.out.println(SizeOfString);
      String a4=a.substring(11); //I want priyanka, index position of p is 11
      System.out.println(a4);// after priyanka there's nothing so using 1 para means 11 to end, 
                                       //u can do P to a also
      String a3=a.substring(8,10); // "is" | for 2 para destination should be less than 1 always
                                   // index of i is , index of s is 11, we are putting 10
      System.out.println(a3);
      String a2=a.substring(3,7); // " name"
      System.out.println(a2);
      String a1=a.substring(0,2); //"My"
      System.out.println(a1);
      System.out.println(a4.concat(" ").concat(a3).concat(" ").concat(a2).concat(" ").concat(a1));
      
	}

}
