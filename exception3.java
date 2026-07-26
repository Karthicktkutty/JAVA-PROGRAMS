

class exception3 {
    public static void main(String[] args) {

      //  Karthick k = Karthick.name;

        System.out.println(Karthick.name);

        System.out.println(Karthick.k.name);

        Karthick ka = Karthick.k;

        System.out.println(ka.name);

    }
}


class KarthickSup {

  static String name;

    protected KarthickSup(String n) {
        name = n;
    }
}

class Karthick extends KarthickSup{

    public static final Karthick k = new Karthick("Hello");

    public Karthick(String n) {
        super(n);
    }
}





