package com.raystec.oop;

public class Shape {

	private String Color;
	private int BorderWidth;
	
public	Shape (){}
public	Shape (String a,int b){
	Color=a;
	 BorderWidth=b;
}
	
		public void setColor(String a) {
			
			 Color=a;
					
	}
	  public String getColor() {
		  
		  return Color;
	  }
	  public void setBorderWidth(int b) {
		  BorderWidth =b;
	  }  
		  
		public int getBoederWidth() {
			return BorderWidth;
			
	  }
	  
}
