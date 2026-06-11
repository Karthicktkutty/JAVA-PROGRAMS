package string;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String actualPassword = "Kodnest123";
       String enteredPassword = "Kodnest123";
       if(actualPassword.equals(enteredPassword)) {
    	   System.out.println("Login successful!"); // Output: Login successful!
    	   
       } else {
    	   System.out.println("Invalid Password.");
       }
	}

}
