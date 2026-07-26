

package Method;
class Main {
    public static void main(String[] args) {
    Adv obj = new Adv();
    obj.add();
    }
}

class Calc {
    void add() {
        System.out.println("in a Calc");
    }
}

class Adv extends Calc {
    void add() {
        System.out.println("in a Adv");
    }
}