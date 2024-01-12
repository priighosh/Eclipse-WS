package assignments;
// Hierarchical level inheritance , Super class with 1 static & 1 non static method
public class Assign18_HLI_P 
{
    void add() //non static
    {
       int a=155;
       int b=122;
       int c=a+b;
       System.out.println(c);
    }
    static void sub() //static 
    {
       int a=155;
       int b=122;
       int c=a-b;
       System.out.println(c);
    }
}
