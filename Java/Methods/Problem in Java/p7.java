
class Main {
    public static void main(String[] args) {
     //   System.out.println("Try programiz.pro");
        Smartlight smart = new Smartlight();
       String x = operate(smart, false);
       System.out.println(x);
       String y = operate(smart, true);
       System.out.println(y);
    }
  //  public static String operate(SmartDevice sd) {
       public static String operate(SmartDevice sd, boolean on) {
    if (on) {
        return sd.turnon();
    } else {
        return sd.turnoff();
    }
}
}

interface SmartDevice {
   String turnon();
    String turnoff();
}
class Smartlight implements SmartDevice {
    public String turnon() {
        return "turn on light";
    }
    public String turnoff() {
        return "turn off light";
    }
}