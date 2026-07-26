import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // size of array
        int[] arr = new int[n];

        int sum = 0;

        // read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // print array
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // calculate average
        double average = (double) sum / n;

        System.out.println("Average: " + average);
    }
}
