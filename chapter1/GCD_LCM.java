import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int on1=n1;
        int on2=n2;  //original n1 & n2 value
        while(n1%n2!=0){
            int rem = n1%n2;
            n1=n2;      //hamne yaha pe divident ko n1 maan aur n2 ko divisor but ham n1 aur n2 kisiko bhi le sakte hai koi fark nhi padta
            n2=rem;
        }
        int gcd = n2;
        int lcm = (on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);


        sc.close();
    }
    
}
