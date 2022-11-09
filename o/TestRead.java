package in.com.rays.io;


import java.io.FileReader;
import java.io.IOException;

public class TestRead {

	public static void main(String[] args) throws IOException {

		FileReader reader =  new FileReader("C:\\Users\\hp\\Desktop\\demo.txt");
		
		int ch = reader.read();
		while(ch>-1) {
		
		System.out.print((char)ch);
		
		ch = reader.read();	}
	}
	
	}


