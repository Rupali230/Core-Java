package in.com.rays.basics;

public class Grading{
	public static void main(String[] args) {
		int number =5; 
		
		if (number>=75) {
			System.out.println("a+");
			
		}else if(number>=60 && number<75) {
			System.out.println("a");
		
		}else if(number>=50 && number<60) {
			System.out.println("b+");
		
		}else if(number>=40 && number<50) {
			System.out.println("b");
		
		}else if(number>=33 && number<40) {
			System.out.println("c");
		
		}else {
			System.out.println("fail");
		}
		
	}
}

