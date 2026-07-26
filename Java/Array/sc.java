import java.util.*;

 class FirstDuplicateDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (map.containsKey(arr[i])) {
                int firstIndex = map.get(arr[i]);
                int secondIndex = i;
                System.out.println(secondIndex - firstIndex - 1);
                return;
            } else {
                map.put(arr[i], i);
            }
        }

        System.out.println(-1); // if no duplicates
    }
}
