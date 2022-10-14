package in.com.rays.oop;

public class Automobile {
private String color=null;
private int speed =0;
private String make= null;
public static int NUM_OF_GEARS ;


public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
	
}
 public void breakk(int i) {
    speed =i-3;
System.out.println(speed);

}
 
 public void gear(int i) {
       speed =i-2;
       System.out.println(speed);
 }
 
 public void accelerator(int k) {
	 speed=k+3;
System.out.println(speed);
 }
}




