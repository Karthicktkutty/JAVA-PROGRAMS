package string;

public class Builder5 {
public static void main(String[] args) {
	StringBuilder builder = new StringBuilder("Hello");
	builder.append(" World");
    builder.insert(5, ",");  // its starting with '0'
    builder.delete(5, 6);
    builder.reverse();
    System.out.println(builder);
}
}
