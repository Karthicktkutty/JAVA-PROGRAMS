
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
abstract class Mentor {
    void trainInterns() {
        System.out.println("Training a Interns");
   }
    void takeAttendance() {
        System.out.println("Take Attendance");
    }
}
class java extends Mentor {
      // super.trainInterns();
    //super.takeAttendance();
    void trainInterns() {
          super.trainInterns();
        System.out.println("Training a Interns");
    }
    void takeAttendance() {
          super.takeAttendance();
        System.out.println("Take Attendance");
    }
}
class sql extends java {
    void trainInterns() {
        System.out.println("Training a Interns");
    }
    void takeAttendance() {
        System.out.println("Sql Attendance");
    }
}
