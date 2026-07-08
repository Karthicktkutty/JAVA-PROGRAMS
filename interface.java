class Main {
    public static void main(String[] args) {
      Computer obj = new Laptop();

      Computer obj2 = new Desktop();
      
      Developer obj3 = new Developer();
      
      obj3.navin(obj);

    // obj3.navin(obj2);
    }
}

interface Computer {
public void code();    // interface variables must a final and static.


}

class Laptop implements Computer {
   public void code() {
        System.out.println("java, python, mysql");
    }
}

class Desktop implements Computer {
   public void code() {
        System.out.println("java python, mysql, AI");
    }
}

class Developer {
    void navin(Computer lap) {
lap.code();
    }
}