// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15

import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(value+"\t");
                value++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
