package in.com.rays.oop;

public class TestO {

	public static void main(String[] args) {
		
		Shape S[] = new Shape[4];
		
		S[0]=getShape(1);
		
		S[1] =getShape(2);
 
		S[2] =getShape(3);
		
		double tot = 0.;
		
		tot = calarea(S);
		
		System.out.println(" Totel area ="+ tot);
	}
		private static double calarea(Shape[]S) {
		
	    double tot = 0;
			    
	    for ( int i = 0; i<S. length ; i ++) {  
		  
	    	tot = S[i].area()+tot;
	    	
	    	System.out.println(S[i].getClass()+" Area ="+S[i].area());
	    }
		return tot;	}		
		public static Shape getShape(int i) {
			
			if (i == 1) return new  Cricle(5);
			
			if (i == 2) return new Retangle(3,4);
			
			if (i ==3) return new Triangle( 4,7);
			
			return null;
		}
	}

