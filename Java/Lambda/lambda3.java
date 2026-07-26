
class Main {
    public static void main(String[] args) {
        Name toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.operate("Hello world"));
    }
}
interface Name {
    String operate(String s);
}