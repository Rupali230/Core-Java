package in.com.rays.Exception;

public class TextException2 {

	public static void main(String[] args) {

		String name =  null;
		
	try {
	
		System.out.println("Length of name is"+name.length());
		
        System.out.println("Charter at 7th position is"+name.charAt(6));
         
	} catch (StringIndexOutOfBoundsException e){

	System.out.println("String abhi choti he!");
	
	} catch (NullPointerException e) { 
		
		System.out.println("Sundar sa nam nahi he");
			
	} finally {
		
		System.out.println(" pandti hu me");
	}
	
	}
}
