package in.com.rays.Exception;

public class LoginException extends Exception {
	
	public LoginException(String s) {
		super(s);
	}
	public static void main(String[] args) throws LoginException, LoginException4 {

		auth("vijay");

	}

	
	private static void auth(String user) throws LoginException, LoginException4 {

		if (!user.equals("admin")) {
			LoginException4 l=new LoginException4();
			
	
		throw  l;
	
	}

		}
	}

