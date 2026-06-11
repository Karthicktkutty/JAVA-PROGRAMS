class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Velan v = new Velan();
       String a = new Main().solutions(v);
       System.out.println(a);
    }
    public  String solutions(Details d) {
        String x = d.operation(); 
        String y = d.open();
        return x + y;
    }
}
interface Person {
   String operation();
   
}
interface Details extends Person {
     String open();
}
class Velan implements Details {
    public String operation() {
       
        return "I am Velan";
    }
   public String open() {
       
        return "I am from TN";
    }
}
