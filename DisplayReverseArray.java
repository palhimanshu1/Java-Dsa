import java.util.*;

public class DisplayReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        displayReverse(arr, 0);
        sc.close();

    }

    public static void displayReverse(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        displayReverse(arr, index + 1);
        System.out.println(arr[index]);
    }

}
