import java.util.*;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreaingIncresingOrder(n, 1);
        sc.close();
    }

    public static void printDecreaingIncresingOrder(int n, int current) {
        if (n > current) {
            return;
        }
        System.out.println(current);
        printDecreaingIncresingOrder(n, current + 1);
        System.out.println(current);

    }

}
