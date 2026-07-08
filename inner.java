public class Main {
    public static void main(String[] args) {
        A obj = new A();

        obj.show();

        A.B obj2 = new A.B();
      //  A.B obj2 = obj.new B();

        obj2.config();


    }
}

public class A {
    public void show() {
        System.out.println("In a show");
    }

  public static class B {
        public void config() {
            System.out.println("In b show");
        }
    }
}