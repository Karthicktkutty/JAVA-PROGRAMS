 class bankAccount {
    private double balance = 10000;
    public double getbalance() {
        return balance;
    }
    public void setbalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Inalid Amount");
        }
    }
}