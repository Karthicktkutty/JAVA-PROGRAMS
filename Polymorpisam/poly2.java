class Main {
    public static void main(String[] args) {
    Laptop obj = new Laptop();

    obj.model = "Asus Vivobook";
    obj.price = 5000;

      Laptop obj1 = new Laptop();

    obj1.model = "Asus Vivobook";
    obj1.price = 5000;

    // boolean result = obj == obj1;
     boolean result = obj.equals(obj1);

    System.out.println(result);

    System.out.println(obj.toString());  // Even you don't mention called toString() - method defaultly.

    System.out.println(obj); 
    }
}
class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
        if(this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }
}