class Main {
    public static void main(String[] args) {
       int c = new Main().run(5, 10);

       System.out.println(c);
    }
     int run(int a, int b) {
        go();
        return a + b;
      //  go();
      }

      static void go() {
        System.out.println("Hey Buddy");
      }
}