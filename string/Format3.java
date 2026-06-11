package string;
import java.util.ResourceBundle;
import java.util.Locale;
public class Format3 {
public static void main(String[] args) {
	Locale currentLocale = new Locale("fr", "FR");
	ResourceBundle messages = ResourceBundle.getBundle("Messages", currentLocale);
	System.out.println(messages.getString("greeting") + "! " + messages.getString("total") + ": 100");
}
}
