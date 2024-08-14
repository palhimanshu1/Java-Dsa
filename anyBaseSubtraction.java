import java.util.*;
public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        int d = getDifference(n1,n2,b);
        System.out.println(d);
        sc.close();

    }

    public static int getDifference(int n1, int n2, int b){
        int rv=0;
        int borrow=0;
        int power=1;

        while(n2>0){
            int digit1 = n1 % 10;
            n1= n1/10;

            int digit2 = n2%10;
            n2 = n2/10;

            int digit=0;
            digit2= digit2+borrow;

            if(digit2>=digit1){
                borrow=0;
                digit = digit2-digit1;

            }
            else{
                borrow = -1;
                digit = digit2+b-digit1;
            }

            rv = rv + digit*power;
            power=power*10;

        }
        return rv;
    }
    

    
}
