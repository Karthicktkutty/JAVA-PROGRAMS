class Main {
 public static void main(String[] args) {
    B obj = new B();
     
 }
}

class A extends Object{

     A() {    // Default Constructor

     super();
    System.out.println("in A");
  }
  A(int n) {     // Paramatrized Constructor
  super();
    System.out.println("in A int");
  }

}

class B extends A {
  B() {
    super(5);
    System.out.println("in B");
  }

   B(int n) {
    super(n);
    System.out.println("in B int");
  }
}