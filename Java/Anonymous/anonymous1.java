class Main {
    public static void main(String[] args) {
        Calc c = new Calc();   // object create
        c.show();
    }
}

interface Add {
    int operation(int a, int b);
}

class Calc {

    // 👇 instance variable
    Add add = new Add() {
        public int operation(int a, int b) {
            return a + b;
        }
    };

    void show() {
        System.out.println(add.operation(10, 5));
    }
}

