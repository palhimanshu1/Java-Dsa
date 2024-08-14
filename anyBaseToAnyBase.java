import java.util.*;
public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int d = getValue(n,b1,b2);
        System.out.println(d);;
        sc.close();
    }

    public static int getValue(int n, int b1, int b2){
        int dec =anyBaseToDecimal(n, b1);
        int dn = decimalToAnyBase(dec, b2);
        return dn;

    }


    public static int decimalToAnyBase(int n, int b2){
        int rv = 0;
        int power =1;
         while(n>0){
            int digit = n%b2;
            n=n/b2;
            rv+= digit*power;
            power*=10;

        }
        return rv;
    }


    public static int anyBaseToDecimal(int n, int b){
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
