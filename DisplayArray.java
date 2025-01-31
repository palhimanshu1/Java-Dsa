import java.util.*;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        displayArr(arr, 0);
        sc.close();
    }

    public static void displayArr(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index]);
        displayArr(arr, index + 1);

    }

}
