public class Switch_Statement {
    public static void main(String[] args) {

        String day = "Monday";
         

        switch(day) {
            case "Saturday", "Sunday":
                System.out.println("6am");
                break;

            case "Monday":
                System.out.println("8am");
                break;

            default:
                System.out.println("7am");
        }

        switch(day) {
            case "Saturday", "Sunday" -> System.out.println("6am");

             case "Monday" -> System.out.println("8am");

              default -> System.out.println("7am");
        }

        String result = "";

        switch(day) {
             case "Saturday", "Sunday" -> result = "6am";

              case "Monday" -> result = "8am";

              default -> result = "7am";

        }
        System.out.println(result);

        result = switch(day) {                          // switch expression is manadory.
            case "Saturday", "Sunday" -> "6am";

            case "Monday" -> "8am";

             default ->  "7am";

        };

        System.out.println(result);

       //      result = switch(day) {       this is not work because return keyword only working in methods.
         //   case "Saturday", "Sunday" -> return = "6am";
//
  //          case "Monday" -> return = "8am";
//
  //           default -> return = "7am";

    //    }
      //  System.out.println(result);
    }
}
