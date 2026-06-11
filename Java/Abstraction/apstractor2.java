class Main {
    public static void main(String[] args) {
        Mentor m;
        m = new java();
        Mentor n;
        n = new react();
        m.teachConcepts();
        m.groomForDrives();
        n.teachConcepts();
        n.groomForDrives();
    }
}
abstract class Mentor {
   abstract void teachConcepts();
  abstract void groomForDrives();
    }
class java extends Mentor {
    void teachConcepts() {
        System.out.println("java mentor teaches java concepts");
    }
    void groomForDrives() {
        System.out.println("GroomDrives");
    }
}
class react extends Mentor {
    void teachConcepts() {
        System.out.println("java mentor teaches java concepts");
    }
    void groomForDrives() {
        System.out.println("GroomDrives");
    }
}
