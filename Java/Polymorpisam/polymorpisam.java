class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());
    }
}
class Person {
    private int age;
    public void setAge(int age) {
        if (age > 0) {
           this.age = age;
            System.out.println("Age is greater");
        } else {
            System.out.println("Age is lesser than");
        }
    }
    public int getAge() {
    return age;
}

}

