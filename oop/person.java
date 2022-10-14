package in.com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class person {
private String name=null;
private String add=null;
private  Date dob =null; 
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
	public void setDate(String date) throws ParseException {
		
	this.dob= sdf.parse(date);
}
	public String getDate()
	{
		String str=sdf.format(dob);
		return str;
	}
}
