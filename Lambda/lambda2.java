class Main {
    public static void main(String[] args) {

        A obj = new A() {

          public int show(int a, int b) {

            return a + b;
          }

        };

      int a =  obj.show(5, 10);

      System.out.println(a);

    }
}

interface A {

    public int show(int a, int b);
}