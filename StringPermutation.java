import java.util.*;
public class StringPermutation {
    public static void solution(String str){
        int n =str.length();
        int f = factorial(n);
        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for(int div =n;div>=1;div--){
                int quotient = temp/div;
                int remainder = temp%div;
                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);

                temp = quotient;
            }
            System.out.println();
        }
        
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
        sc.close();

    }
    
}
