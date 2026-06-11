 class Main {
    public static void main(String[] args) {
    Multiply m = new Multiply();
    int x = Operations(m);
        System.out.println("Try programiz.pro " + x);
    }
    static int Operations(Add a) {
        return a.Operation();
    }
}
 interface Add {
    int Operation();
}
public class Multiply implements Add {
   public int Operation() {
        return 16 + 10;
    }
}
