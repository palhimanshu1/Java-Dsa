import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b  = sc.nextInt();
        int db = decimalToBase(n,b);
        System.out.println(db);
        sc.close();
    }

    public static int decimalToBase(int n, int b){
        int rv = 0;
        int power =1;
         while(n>0){
            int digit = n%b;
            n=n/b;
            rv+= digit*power;
            power*=10;

        }
        return rv;
    }
}
