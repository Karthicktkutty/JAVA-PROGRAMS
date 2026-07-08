
class Main {

public static void main(String[] args) {

Continue s1 = Continue.Failed;

System.out.println(s1);

s1 = Continue.Particular;
System.out.println(s1);

s1 = Continue.Continue;

System.out.println(s1);
}

}

enum Continue {

Failed(), Continue(), Particular();

}
