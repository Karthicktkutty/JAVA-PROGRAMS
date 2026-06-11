 interface Add {
    int Operation(int a, int b);
}
class Main {
    public static void main(String[] args) {
        Add a = new Add() {
            public int Operation(int a, int b) {
                return a + b;
            }
        };
       int x = a.Operation(10, 5);
       System.out.println(x);
    }
}