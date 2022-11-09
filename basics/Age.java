package in.com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Age {

	public static void main(String[] args) throws Exception {
		
		Date today = new Date();
		
		SimpleDateFormat Sdf = new  SimpleDateFormat("dd/MM/yyyy");
		
		Date dob = Sdf.parse ("23/5/2003");
		
		int a = today.getYear();
		
		int b = dob. getYear(); 
		
		int c = a-b;
		
		System.out.println("Age =" +c);
		
		
	}

		
	}

	
		


