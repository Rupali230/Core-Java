package in.com.rays.oop;


public class Retangle extends Shape  {

		private int length ;
		
		private int width ;
     
		
		
		public Retangle(int a,int b) {
			
			length = a;
			width = b;
					
		}
			
			public double area () {
        	return length*width;
			}
			
	public int getlength() {
		return length;
		
	}
	public int getWidth() {
	return width;	
	}
	}
		
	
	
	
