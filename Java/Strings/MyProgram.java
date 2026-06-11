// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MyProgram {
    public static void main(String[] args) {
       if(args.length > 0) {
           for (int i = 0; i < args.length; i++) {
               System.out.println("Argument" + i + ":" + args[i]);
               
           }
       } else {
           System.out.println("No arguments were passed.");
       }
    }
}