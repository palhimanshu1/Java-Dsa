import java.util.*;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasingOrder(n);
        sc.close();
    }

    public static void printIncreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        printIncreasingOrder(n - 1);

        System.out.println(n);
    }
}
