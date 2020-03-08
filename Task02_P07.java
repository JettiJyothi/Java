package Task02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task02_P07 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//7. Write a Java Program to Convert String to Date 
		 String sDate1="14/02/2020";  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    System.out.println(sDate1+"\t"+date1);  
	}

}
