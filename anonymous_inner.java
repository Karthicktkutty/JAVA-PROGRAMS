class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In A show");
            }

            
        };
        obj.show();
        
    }
}

class A {
    public void show() {
        System.out.println("in a show");
    }
}