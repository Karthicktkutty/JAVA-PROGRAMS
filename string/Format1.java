package string;

public class Format1 {
public static void main(String[] args) {
	String format = String.format("Hello %s, your total is $%.2f", "Ravi",123.456);
	System.out.println(format);
}
}
