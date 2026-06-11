
class Main {
    public static void main(String[] args) {
        bankAccount s1 = new bankAccount();
        System.out.println("Current Balance $ " + s1.getbalance());
        s1.setbalance(15000);
        System.out.println("Update Balance $ " + s1.getbalance());
        s1.setbalance(-15000);
    }
}