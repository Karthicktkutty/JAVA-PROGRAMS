package string;

public class Builder {
  public static void main(String[] args) {
	  StringBuilder sb = new StringBuilder();
	  sb.append("Hello");
	  sb.append(" ");
	  sb.append("World");
	  String greeting = sb.toString();
	  System.out.println(greeting);
  }
}
