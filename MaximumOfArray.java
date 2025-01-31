import java.util.*;

public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = MaxOfArray(arr, 0);
        System.out.println(max);

        sc.close();
    }

    public static int MaxOfArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int misa = MaxOfArray(arr, index + 1); // misa == max in small array
        if (misa > arr[index]) {
            return misa;
        } else {
            return arr[index];
        }

    }

}
