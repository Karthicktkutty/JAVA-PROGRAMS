class Main {
    public static void main(String[] args) {
Student s = new Student();

s.get();

s.set();
    }
}

class Student {
    int age;
    String name;
Student() {
age = 20;
name = "Karthick";
}

void get() {
    System.out.println(age + name);
}

void set() {
    System.out.println(age + name);
}
}