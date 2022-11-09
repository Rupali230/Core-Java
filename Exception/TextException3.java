package in.com.rays.Exception;

public class TextException3 {

public static void main(String[] args) {

	String name =  null;
	
try {

	System.out.println("Length of name is"+name.length());
	
    System.out.println("Charter at 7th position is"+name.charAt(6));
     
} catch (StringIndexOutOfBoundsException e){

System.out.println("String abhi choti he!");

} catch (RuntimeException e) {
	
	System.out.println("sundar sa nam nahi he");
	
}finally {
	
	System.out.println("pandit hu me");
	
}
	
}
}
