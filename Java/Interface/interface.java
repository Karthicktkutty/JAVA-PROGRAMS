class Main {
    public static void main(String[] args) {

        Mentor m = new java();   // upcasting
        Mentor n = new react();  // upcasting

        m.teachConcepts();
        m.groomForDrives();

        n.teachConcepts();
        n.groomForDrives();
    }
}

interface Mentor {
    void teachConcepts();
    void groomForDrives();
}
class java implements Mentor {

    public void teachConcepts() {
        System.out.println("Java mentor teaches Java concepts");
    }

    public void groomForDrives() {
        System.out.println("Java mentor grooms for drives");
    }
}
class react implements Mentor {

    public void teachConcepts() {
        System.out.println("React mentor teaches React concepts");
    }

    public void groomForDrives() {
        System.out.println("React mentor grooms for drives");
    }
}
