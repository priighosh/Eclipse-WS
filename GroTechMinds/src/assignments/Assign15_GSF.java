package assignments;
/* Find the area of a circle where pi is global, static and final variable in nature
and find the area of a circle passing the radius inside main method */
public class Assign15_GSF
{
	final static double pi=3.14;
    public static void main(String[] args) 
	{
	 int r=4;
	 double AreaOfcircle=pi*r*r;
     System.out.println("Area of a circle is: " + AreaOfcircle);
     System.out.println(AreaOfcircle);
	}

}
