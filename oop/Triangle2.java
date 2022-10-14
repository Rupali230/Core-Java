package in.com.rays.oop;

public class Triangle2 {	

	public static void main(String[] args) {
		
		Triangle T= new Triangle (5,8);
		
		
		Retangle r= new Retangle(6,7);
		r.setBorderWidth(7);
        r.setColor("red");
        
        T.setBorderWidth(8);
        T.setColor("green"); 
        
     System.out.println(T.getBoederWidth());
     System.out.println(T.getColor());
     
     System.out.println(r.getBoederWidth());
     System.out.println(r.getColor());
     
     System.out.println(T.area());
     
     System.out.println(T.area());
     
	}
   
		
	 	
		
		
	}

