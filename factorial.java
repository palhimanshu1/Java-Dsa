import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorialOutput(n);
        System.out.println(f);
        sc.close();
    }

    public static int factorialOutput(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = factorialOutput(n - 1);
        int fn = n * fnm1;
        return fn; // yeah return value fn hame fnm1 me jake save hoga
    }

}
