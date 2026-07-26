class Main {
    public static void main(String[] args) {


         int i = 20;

         int j = 0;

         try {

            j = 18/i;
             
            if(j == 0) {
                throw new Karthick("I don't want to print  zero");
            }
        }

        catch(Karthick e) {

            j = 18/1;

            System.out.println("thats the default output" + e);
        }

        catch(Throwable e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}

class Karthick extends Throwable {

    public Karthick(String error) {
        super(error);
    }

}

