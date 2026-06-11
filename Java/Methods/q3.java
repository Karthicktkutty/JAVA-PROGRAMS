class Project {
    public static void main(String[] args) {
        String firstname = "Ajay";
        String lastName = "kumar";
        printName(firstname, lastName);
    }

    static void printName(String fName, String lName) {
        String fullName = fName + " " + lName;
        System.out.println(fullName);
    }
}