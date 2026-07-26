 
 class Main {
    public static void main(String[] args) {

       Day d = Day.Sun;
       d = Day.Mon;
       d = Day.Tuesday;

      System.out.println(d.name);

    }
}
 
 class Days {

   protected String name;

    int ordinal;

    protected Days(String name, int ordinal) {
        this.name = name;

        this.ordinal = ordinal;
    }
}


final class Day extends Days {


    public static final Day Sun = new Day("Failed", 0);
    public static final Day Mon = new Day("Mon", 1);
    public static final Day Tuesday = new Day("Tuesday", 2);


    private Day(String name, int ordinal) {
        super(name, ordinal);
    }
}

