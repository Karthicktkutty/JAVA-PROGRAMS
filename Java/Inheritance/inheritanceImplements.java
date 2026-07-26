 class Main {
    public static void main(String[] args) {
        D obj = new D();
      //  obj.D();
        obj.A();
        obj.B();
        obj.C();
        obj.D();
    }
}

interface A {
void A();
}
interface B {
   void B();
}
interface C {
    void C();
}
class D implements A, B, C {
   public void A() {
        System.out.println("A");
    }
    public void B() {
        System.out.println("B");
    }
   public void C() {
        System.out.println("C");
    }
    void D() {
        System.out.println("D");
    }
}
