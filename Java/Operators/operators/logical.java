public class LoginCheck {
    public static void main(String[] args) {
        String username = "Karthick";
        String password = "JavaRocks";

        boolean isValid = username.equals("Karthick") && password.equals("JavaRocks");

        if (isValid) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Invalid Credentials.");
        }
    }
}