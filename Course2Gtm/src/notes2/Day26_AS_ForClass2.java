package notes2; // default class C2
//AS for class=public=C2, C2 can call C1 which is present inside same package
 class Day26_AS_ForClass2 
 { 
	 public void arithmetic()//c2 method
	 {
	 System.out.println("arithmatic ops");
	 }

	public static void main(String[] args) 
	{
	Day26_AS_ForClass1.add(); //CN.MethodName,syntax to call static method from diff class not having relation
	
	//C2 can access/call C1
	
	Day26_AS_ForClass1 d6=new Day26_AS_ForClass1(); //from C1
	d6.sub();
	d6.sub1();
	Day26_AS_ForClass1.add(); //same as 1st method called
     


	}

}
