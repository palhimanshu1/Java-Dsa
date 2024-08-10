import java.util.Scanner;


public class marks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your marks :");
            int marks = sc.nextInt();
            if(marks>90){
                System.out.println("excellent");
            }else if(marks>80){
                System.out.println("good");
            }else if(marks>70){
                System.out.println("fair");
            }else if(marks>60){
                System.out.println("meet expectation");
            }
            else{
                System.out.println("par");
            }
        }
    }
    
}
