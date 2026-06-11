class Main {
    public static void main(String[] args) {
        java j = new java();
        sql s = new sql();
        
        startSession(j);
        startSession(s);
        
    }
    static void startSession(Mentor men) {
        men.trainInterns();
        men.takeAttendance();
    }
}

class Mentor {
    void trainInterns() {
        System.out.println("Training a Interns");
    }
    void takeAttendance() {
        System.out.println("Take Attendance");
    }
}
class java extends Mentor {
    void trainInterns() {
        System.out.println("Training a Interns");
    }
    void takeAttendance() {
        System.out.println("Take Attendance");
    }
}
class sql extends Mentor {
    void trainInterns() {
        System.out.println("Training a Interns");
    }
    void takeAttendance() {
        System.out.println("Take Attendance");
    }
}

