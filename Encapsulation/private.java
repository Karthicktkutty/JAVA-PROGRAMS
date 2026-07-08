class Main {
    public static void main(String[] args) {
    
    Human h = new Human();

    h.setAge();
    h.setName();

    System.out.println(h.getAge());
    System.out.println(h.getName());
    }
}

class Human {
    private int age;
    private String name;

   
    
    int getAge() {
      
        return age;
    }

   void setAge() {
        age = 20;
    }

    String getName() {

        return name;
    }

   void setName() {
        name = "Karthick";
    }
}