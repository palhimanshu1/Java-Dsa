import java.util.*;

public class TowerOfHonai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1d = sc.nextInt();
        int t2d = sc.nextInt();
        int t3d = sc.nextInt();

        toh(n, t1d, t2d, t3d);
        sc.close();

    }

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if (n == 0) {
            return;
        }

        toh(n - 1, t1id, t3id, t2id); // will priint the instruction to print n-1 disk from t1 to t3 using t2
        System.out.println(n + "[" + t1id + "-->" + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);
    }

}
