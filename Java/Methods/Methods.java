class Main {
    public static void main(String[] args) {
        String fname = "Sri";
        String lname = "Nagarajan";
       String fullName = printName(fname , lname);
        System.out.println(fullName);
    }
    static String printName(String firstName , String lastName) {
        String fullName =firstName + lastName;
        return fullName;
    }
}