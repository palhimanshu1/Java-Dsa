//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1



import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp=n/2;
        int star=1;
        int value=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }

            int cval=value;
            for(int j=1;j<=star;j++){
                System.out.print(cval+"\t");

                if(j<=star/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            if(i<=n/2){
                sp--;
                star+=2;
                value++;
            }else{
                sp++;
                star-=2;
                value--;
            }
            System.out.println();
        }
        sc.close();

    }
    
}
