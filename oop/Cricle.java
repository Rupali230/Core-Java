package in.com.rays.oop;

public class Cricle extends Shape {
private int red;
	public Cricle() {
		// TODO Auto-generated constructor stub
	}
	public Cricle(int i) {
		red=i;
	}
	public double area() {
		
		return 3.14*red*red;
	}

}
