// here time complexity is log(n)
  


import java.util.*;

public class LogarathmicPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
        sc.close();
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int xpnb2 = power(x, n / 2);
        int xn = xpnb2 * xpnb2;

        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;

    }

}
