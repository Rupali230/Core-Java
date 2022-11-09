package in.com.rays.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestHash {

	public static void main(String[] args) {

      Set S =new HashSet();
      
      S.add (2);
      S.add (3);
      S.add (5);
      S.add (6);
      S.add (7);
      S.add (3);
      S.add (5);
      S.add (6);
      
      System.out.println(S);
   
	}

}
