import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;


public  class Get_Date {
	static DateTimeFormatter dateFromat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //define format of date
	static LocalDateTime now = LocalDateTime.now();// get the local time from system with the .now suffix
	
	public Get_Date(){
		  dateFromat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //set format of date
		  now = LocalDateTime.now(); // set the local time from system with the .now suffix
	}
	
	public static void date_Now() {
		   System.out.println(dateFromat.format(now));
	}
}
