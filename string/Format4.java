package string;
import java.text.NumberFormat;
import java.util.Locale;
public class Format4 {
public static void main(String[] args) {
	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	System.out.println(currencyFormatter.format(1000000));
}
}
