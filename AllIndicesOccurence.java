import java.util.*;

public class AllIndicesOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        int[] iarr = allIndices(arr, data, 0, 0);
        if (iarr.length == 0) {
            System.out.println("not available");
            // return;
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
        sc.close();
    }

    public static int[] allIndices(int[] arr, int x, int index, int fsf) {

        if (index == arr.length) {
            return new int[fsf];
        }

        if (arr[index] == x) {
            int[] iarr = allIndices(arr, x, index + 1, fsf + 1);
            iarr[fsf] = index;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, index + 1, fsf);
            return iarr;
        }

    }
}
