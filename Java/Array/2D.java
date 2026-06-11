import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[][] marks = new int[3][4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print((i + 1) + (j + 1));
            }
        }
        System.out.println("\nMarks of Students");
        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]);
            }
            System.out.println();
        }
    }
}