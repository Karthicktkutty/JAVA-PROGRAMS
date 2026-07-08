class Main {
    public static void main(String[] args) {

        Human h = new Human();

        h.setAge(20);
        h.setName("Karthick");

        System.out.println(h.getAge());
         System.out.println(h.getName());
    }
}

class Human {
    private int age;
    private String name;

    void setAge(int a) {
      age = a;
    }

     void setName(String a) {
      name = a;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}