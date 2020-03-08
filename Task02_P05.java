package Task02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task02_P05 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//5. Write a Java Program to Calculate Difference Between Two Time Periods 
		/*
		 * String time1 = "16:00:00"; String time2 = "19:00:00";
		 * 
		 * SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss"); Date date1 =
		 * format.parse(time1); Date date2 = format.parse(time2); long difference =
		 * date2.getTime() - date1.getTime(); System.out.println(difference);
		 */
		String Start_time = "09:29:58";
		String Stop_time = "10:31:48";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(Start_time);
			d2 = format.parse(Stop_time);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			
			System.out.print(diffHours + " hrs, ");
			System.out.print(diffMinutes + " mins, ");
			System.out.print(diffSeconds + " sec");

		} catch (Exception e) {		}

	}

}