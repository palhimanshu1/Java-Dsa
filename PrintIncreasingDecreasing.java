import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasingDecreasingOrder(n, 1);
        sc.close();
    }

    public static void printIncreasingDecreasingOrder(int n, int current) {
        if (current > n) {
            return;
        }
        System.out.print(current);
        printIncreasingDecreasingOrder(n, current + 1);
        System.out.print(current);
    }
}
