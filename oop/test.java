package in.com.rays.oop;

import java.text.ParseException;

public class test {
	
	public static void main(String[] args) throws ParseException {
		Automobile A= new Automobile();
		Account S=new Account();
		person p= new person();
		S.setNumber("991710510003051");
		S.setAccounttype("saving");   
		S.setBalance(5000);
		S.paybill(500);
		S.withdraw(100);   
		S.deposite(400);
		System.out.println(S.getBalance());

		A.setColor("pink");
		A.setSpeed(100);
		A.setMake("honda");
		A.breakk(5);
		A.gear(4);
		
		p.setAdd("indore");
		p.setName("ram");
		p.setDate("15/9/2022");
		
		System.out.println(p.getName());
		System.out.println(p.getAdd());
		System.out.println(p.getDate());
		
		System.out.println(A.getColor());
		System.out.println(A.getSpeed());
		A. gear(3);
		A.accelerator(3);
	}

}
