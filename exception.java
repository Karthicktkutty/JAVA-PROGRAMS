class Main {
    public static void main(String[] args) {
        int i = 4;

        int j = 0;

        int num[] = new int[5];

        String name = null;

        try {
            j = 18/i;
            
            System.out.println(name.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit");
        }

        catch(Exception e) {
            System.out.println("This is default");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}