class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Person p = new Person();
     p.setAge(20);
     int x = p.getAge();
     System.out.println(x);
    }
}
class Person {
    private int age;
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Age is lesser than");
        }
    }
    public int getAge() {
        return age;
    }
}

