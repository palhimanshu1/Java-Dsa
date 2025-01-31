import java.util.*;

public class printDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingOrder(n);
        sc.close();

    }

    public static void printDecreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasingOrder(n - 1);
    }

}