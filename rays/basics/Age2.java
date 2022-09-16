package com.rays.basics;

import java.time.LocalDate;
import java.time.Period;
public class Age2 {
	
	public static void main(String[] args) {
		 
		
		LocalDate today= LocalDate.now();
		
		LocalDate dob = LocalDate.of(2003,5,23);
		
		Period diff =Period.between(today, dob);
		
		System.out.println(diff);
		
		
	}

}
