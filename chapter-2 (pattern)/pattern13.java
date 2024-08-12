// 5
// 1
// 1       1
// 1       2       1
// 1       3       3       1
// 1       4       6       4       1



import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp1=icj*(i-j)/(j+1);
                icj=icjp1;

            }
            System.out.println();

        }
        sc.close();
    }
}
