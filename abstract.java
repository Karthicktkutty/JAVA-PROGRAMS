
class Main {
    public static void main(String[] args) {

        Car obj = new tataUpdate();

    obj.drive();

    obj.playMusic();

    tata obj1 = (tata) obj;

    obj1.fly();

   tata obj2 = new tataUpdate();
   obj2.drive();
   obj2.fly();

    }
}

abstract class Car {
    public abstract void drive();


    public void playMusic() {
        System.out.println("Play Music");
    }
}

abstract class tata extends Car {
    public void drive() {
        System.out.println("Driving");
    }

    public abstract void fly();
}

class tataUpdate extends tata {
    public void fly() {
        System.out.println("Flying");
    }
}