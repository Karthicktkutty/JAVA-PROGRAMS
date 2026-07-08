class Main {
    public static void main(String[] args) {
     
     A obj = (A) new B();  // Upcasting
     obj.show1();

    // A obj = new B();
    // obj.show1();

     B obj1 = (B) obj;  // Downcasting
     obj1.show2();

    }
}

class A {
    void show1() {
        System.out.println("In A show");
    }
   
}

class B extends A {
      void show2() {
        System.out.println("In B show");
    }
}