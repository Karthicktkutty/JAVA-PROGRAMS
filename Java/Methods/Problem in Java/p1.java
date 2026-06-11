interface Vehicle {
    String Model();
}
interface Honda extends Vehicle {
    String Sanda();
}
class Van implements Honda {
   public String Model() {
        return "What is Model";
    }
   public String Sanda() {
        //System.out.println("Car name");
        return "Car Name";
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Van v = new Van();
      String returns = operation(v);
      System.out.println(returns);
    }
    public static String operation(Honda h) {
      //  h.Model();
    //    h.Sanda();
        return h.Model() + h.Sanda();
    }
}