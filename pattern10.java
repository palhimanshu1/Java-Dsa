//hollow daimond

import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int outerSpce = n/2;
        int innerSpace = -1;
        
        for(int i=1;i<=n;i++){
            // System.out.print(outerSpce +","+innerSpace);
            for(int j=1;j<=outerSpce;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j=1;j<=innerSpace;j++){
                System.out.print("\t");
            }

            if(i>1 && i<n){
                System.out.print("*\t");
            }
            if(i<=n/2){
                outerSpce--;
                innerSpace+=2;
            }else{
                outerSpce++;
                innerSpace-=2;
            }
            System.out.println();
        }
        




        sc.close();
    }
}
