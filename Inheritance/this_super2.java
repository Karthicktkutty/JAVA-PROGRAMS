class Main {
 public static void main(String[] args) {
    B obj = new B(5);
     
 }
}

class A {

     A() {    // Default Constructor
    System.out.println("in A");
  }
  A(int n) {     // Paramatrized Constructor
    System.out.println("in A int");
  }

}

class B extends A {
  B() {
    System.out.println("in B");
  }

   B(int n) {
    System.out.println("in B int");
  }
}