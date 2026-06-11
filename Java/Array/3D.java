
public class Student {
    public static void main(String[] args) {
        int[][][] sales = new int[3][4][5];
       for (int i = 0; i < sales.length; i++) {
           for(int j = 0; j < sales[i].length; j++) {
               for(int k = 0; k < sales[i][j].length; k++) {
                   System.out.print(sales[i][j][k]);
               }
               System.out.println();
           }
           System.out.println();
       }
    }
}