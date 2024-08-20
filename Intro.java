import java.util.*;
public class Intro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("enter roll no");
        int roll = sc.nextInt();
        System.out.println(name+roll);
    }
};