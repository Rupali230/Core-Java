package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileLine {

	public static void main(String[] args) {
		
	FileReader reader = new FileReader("C:\\Users\\hp\\Desktop\\demo.txt");
	
	BufferedReader br = new BufferedReader(reader);

	String line = br.readLine();
	
	While(line!=null) ;

		System.out.println(line);
	line = br.readLine();	
	}
	

		
	}
}