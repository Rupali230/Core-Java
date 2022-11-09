package in.com.rays.basics;

public class Carspeed {

	public static void main(String[] args) {
		
		int speed =80;
		if(speed<20) {
			System.out.println("first gear");
			
		} else if(speed >=20 && speed<40) {
          System.out.println("second gear");

		}else if (speed>=40 && speed<60) {
			System.out.println("third gear");
			
			
		}else if (speed >=60 && speed <120) {
			System.out.println("fourth gear");
		
		}else {
		System.out.println("Stop");
		
		}
	}
}
