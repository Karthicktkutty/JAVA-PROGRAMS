package string;
import java.text.MessageFormat;
public class Format2 {
public static void main(String[] args) {
	String template = "Hello {0}, your account balance as of {1} is {2}.";
	String formattedMessage = MessageFormat.format(template, "Anil", "12-Sep-2024", "10,000");
	System.out.println(formattedMessage);
}
}
