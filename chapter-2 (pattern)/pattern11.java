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
