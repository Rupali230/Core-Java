package in.com.rays.oop;

public class Person2 {

	private String Firstname ;
	private String Lastname  ;
	private  String Address ;
	
 public void  Person2 () {
	 System.out.println(" Person2 default con");
 }
	 
	 public Person2 (String fn, String ln) { 
		 Firstname = fn;
		 Lastname = ln;
		 System.out.println( "2 params con+ String fn + String ln");
	 }
	 
public Person2(String fn , String ln , String Add) {
	 this( fn,ln);
	 Address = Add;
	 System.out.println("3 parms con " +fn +" "+ ln + Address);

	}   
     

public static void main(String[] args) {
	
	Person2 p = new Person2("Rupali","Patel" ,"Indore") ;
		
}
}

