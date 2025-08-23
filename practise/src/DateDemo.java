import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar cd = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/y hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sd.format(d));
		System.out.println(cd.get(Calendar.MONDAY));
	}

}
