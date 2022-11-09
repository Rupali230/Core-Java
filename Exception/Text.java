package in.com.rays.Exception;

public class Text {

	public static void main(String[] args) {

		String s= "vijay";
		
		try {
			
			System.out.println(s.length());
		}catch (NullPointerException e) {
			
			System.out.println(e.getMessage());
						
			System.out.println(s.charAt(5)); 
		}catch (RuntimeException e) {
		}

	}

}
