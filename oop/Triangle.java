package in.com.rays.oop;

public class Triangle extends Shape {



private int base;
private int hight;

  public Triangle() {
	 
	  
}
   public Triangle(int a,int b) {
	   base=a ;
	   hight=b;
   }
   
   public int getBase() {
	   return base;
	   
	   
   }
   
   public double area() {
	   return base*hight;
   }
}
