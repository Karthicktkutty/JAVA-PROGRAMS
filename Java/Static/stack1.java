class Program {
    static int a;
    static {
        System.out.println("Inside the static-block");
        a = 10;
         System.out.println(a);
    }
    int b;
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Program p1 = new Program();
        p1.a = 30;
        p1.display();
         Program p2 = new Program();
        p2.display();

    }
}