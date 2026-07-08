class Main {
    public static void main(String[] args) {

        Human h = new Human();

        h.setAge(20, h);
        h.setName("Karthick", h);

        System.out.println(h.getAge());
         System.out.println(h.getName());
    }
}

class Human {
    private int age;
    private String name;

    void setAge(int a, Human h) {
        Human h1 = h;
      h1.age = a;
    }

     void setName(String a, Human h) {
        Human h1 = h;
      h1.name = a;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}