// import java.util.*;

// public class prime_number {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("enter the total number to check");
//         long total_num = sc.nextLong();
//         for(int i=0;i<total_num;i++){
//             System.out.println("enter the number");
//             int num = sc.nextInt();
//             int count = 0;
//             for(int div=1;div<=num;div++){
//                 if(num % div==0){
//                     count++;
//                 }
//             }
//             if(count==2){
//                 System.out.println("the number "+num+" is prime number");

//             }else{
//                 System.out.println(num+" number is not a prime number");
//             }
//         }
        
//         sc.close();


//     }
// }

// // ALT method
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int count = 0;
            int num = sc.nextInt();
            for(int div = 2;div*div<=num;div++){
                if(num % div == 0){
                    count++;
                    break;
                }
            }if(count==0){
                System.out.println(num+" is a prime number");
            }else{
                System.out.println(num+" is not a prime number");
            }
        }
        sc.close();
    }
}
