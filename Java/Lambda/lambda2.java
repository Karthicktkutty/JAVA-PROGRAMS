
class Main {
    public static void main(String[] args) {
      Add ash = (a, b) -> a + b;
     int x = ash.Operation(2, 10);
     System.out.println(x);
      System.out.println(ash.Operation(2, 10));
}
}
 interface Add {
    int Operation(int a, int b);
}