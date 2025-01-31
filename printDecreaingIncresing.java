import java.util.*;

public class printDecreaingIncresing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreaingIncresingOrder(n);
        sc.close();
    }

    public static void printDecreaingIncresingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreaingIncresingOrder(n - 1);
        System.out.println(n);
        ;

    }

}
