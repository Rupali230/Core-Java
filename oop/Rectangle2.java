package in.com.rays.oop;

import java.awt.Rectangle;

public class Rectangle2 {
	
   
	public static void main(String[] args) {
		
		Shape S []=new Shape[4];
		
		S[0] = new  Retangle(5,8);
		
		S[1] =  new Cricle(5);
		
		S[2] = new Triangle(5,6);
		
 		S[3] = new Square(7);
 		
		double tot= 0;
	 	
		for( int i =0; i <S. length; i++) { 
		tot=	S[i] .area()+ tot;
		System.out.println(S[i].getClass()+"\tArea="+S[i].area());
		
		}
		System.out.println("totel area="+tot);
	}
	
	}


