import java.util.*;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int fi = firstIndex(arr, 0, data);
        System.out.println(fi);
        sc.close();
    }

    public static int firstIndex(int[] arr, int index, int data) {
        if (index == arr.length) {
            return -1;
        }

        int fiisa = firstIndex(arr, index + 1, data);
        if (arr[index] == data) {
            return index;
        } else {
            return fiisa;
        }

    }

}
