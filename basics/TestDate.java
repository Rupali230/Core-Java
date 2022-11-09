package in.com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		String nd =sdf.format(d);
		
         System.out.println(nd);
         
         String s="23/05/2003";
        		 
        Date d1= sdf.parse(s);	
    System.out.println(d1);    
	}
	
}
