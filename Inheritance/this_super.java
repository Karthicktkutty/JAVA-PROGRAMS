class Main {
 public static void main(String[] args) {
    B obj = new B();
       obj = new B();
 }
}

class A {

     A() {    // Default Constructor
    System.out.println("in A");
  }

}

class B extends A {
  B() {
    System.out.println("in B");
  }
}