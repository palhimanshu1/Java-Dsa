import java.util.*;
public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int b= sc.nextInt();
        int d = getProduct(n1,n2,b);
        System.out.println(d);
    }

    public static int getProduct(int n1, int n2, int b){
        int rv = 0;
        int p = 1;
        while(n2>0){
            int digit2  = n2%10;
            n2=n2/10;
            int singleProduct = getProductWithASingleDigit(n1,digit2,b);
            rv = getSum(rv, singleProduct*p, b);
            p = p*10;
        }
        return rv;

    }

    public static int getProductWithASingleDigit(int n1, int digit2,int b){
        int rv = 0;
        int power = 1;
        int carry =0;
        while(n1>0||carry>0){
            int digit1 = n1%10;
            n1 = n1/10;

            int digit = digit1 * digit2 +carry;
            carry = digit/b;
            digit = digit%b;

            rv = rv+digit*power;
            power = power*10;


        }
        return rv;


    }



    public static int getSum(int n1, int n2, int b){
        int rv = 0;
        int power = 1;
        int carry = 0;
        while(n1>0 || n2>0 || carry>0){
            int digit1 = n1%10;
            int digit2 = n2%10;
            n1=n1/10;
            n2=n2/10;
            int sum = digit1 + digit2 + carry;
            carry = sum/b;
            sum=sum%b;


            rv +=sum*power;
            power= power*10;
        }
        return rv;
    }
    
}
