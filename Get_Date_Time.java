import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.time.LocalDateTime;


public  class Get_Date_Time {
	static DateTimeFormatter dateFromat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //define format of date
	static LocalDateTime now = LocalDateTime.now();// get the local time from system with the .now suffix

	public Get_Date_Time(){
		  dateFromat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //set format of date
		  now = LocalDateTime.now(); // set the local time from system with the .now suffix
	}
	
	public static String generate_date_only(){
		dateFromat = DateTimeFormatter.ofPattern("yyyyMMdd");
		now = LocalDateTime.now();

		return dateFromat.format(now);

	}

	public static void date_Time_Now() {
		   System.out.println(dateFromat.format(now));
	}
}
