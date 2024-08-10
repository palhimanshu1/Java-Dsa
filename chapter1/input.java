import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of first number");

        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("the sum of "+num1+" and "+num2+" is " +(num1+num2));
        sc.close();
    }
}
