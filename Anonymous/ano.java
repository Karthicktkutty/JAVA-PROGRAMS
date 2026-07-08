class Main {
    public static void main(String[] args) {
    new Student().show();     // Anonymous class

    new Student().result();
    }
}

class Student {
    void show() {
        System.out.println("I am a student");
    }

    void result() {
        System.out.println("My marks is 70");
    }
}