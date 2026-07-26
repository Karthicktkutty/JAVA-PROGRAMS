

import tools.db.superCal;
 class Calculator {
    public static void main(String[] args) {
        superCal obj = new superCal();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.mul(4, 8);
        int r4 = obj.div(5, 8);
        double r5 = obj.power(5, 7);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}