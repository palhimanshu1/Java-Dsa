
import java.util.Scanner;

public class Lastoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int li = lastIndex(arr, 0, data);
        System.out.println(li);
        sc.close();
    }

    public static int lastIndex(int[] arr, int index, int data) {
        if (index == arr.length) {
            return -1;
        }

        int liisa = lastIndex(arr, index + 1, data);
        if (liisa == -1) {
            if (arr[index] == data) {
                return index;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }

}
