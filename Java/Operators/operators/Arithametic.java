public class EMICalculator {
    public static void main(String[] args) {
        double principal = 500000; // loan amount
        double rate = 7.5 / 100;   // annual interest
        int years = 5;

        double emi = (principal * rate * Math.pow(1 + rate, years)) / (Math.pow(1 + rate, years) - 1);
        System.out.println("Monthly EMI: ₹" + emi);
    }
}