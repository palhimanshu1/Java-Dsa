import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d=sc.nextInt();
        int f = getDigitFrequency(n,d);
        System.out.println(f);
        sc.close();
    }

    public static int getDigitFrequency(int n, int d){
        int rv=0;
        while(n>0){
            int remainder=n%10;
            n=n/10;

            if(remainder==d){
                rv++;
            }
        }
        return rv;
    }
    
}
