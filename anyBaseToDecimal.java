import java.util.*;
public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d= getValueInDecimal(n,b);
        System.out.println(d);
        sc.close();
    }
    public static int getValueInDecimal(int n, int b){
        int rv =0;
        int p = 1;
        while(n>0){
            int digit = n%10;
            n=n/10;
            rv += digit*p;
            p = p*b;
        }
        return rv;
    }
    
}
