package string;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class Format5 {
public static void main(String[] args) {
	Date today = new Date();
	DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, new Locale("fr", "FR"));
	System.out.println(dateFormatter.format(today));
}
}
