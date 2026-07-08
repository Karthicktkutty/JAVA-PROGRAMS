class Main {
 public static void main(String[] args) {
    B obj = new B(7);
     
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
    super();
    System.out.println("in B");
  }

   B(int n) {
    this();  // this keyword execute the same class.
    System.out.println("in B int");
  }
}