class operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(" add " + (a+b) + (a-b));
        System.out.println("Relational " + (a > b));
        System.out.println("Logical: " + (a > b && b < 3));
        System.out.println("Modules " + (a % b));
        boolean isadult = a >= 9;
        if(isadult) {
            System.out.println("Yes I am adult");
        } else {
            System.out.println("No I am Not Adult");
        }
    }
}



