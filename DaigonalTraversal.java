import java.util.*;
public class DaigonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int g=0;g<arr.length;g++){          //g=gap between i and j 
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.print(arr[i][j]+" ");

            }

        }
        System.out.println();
        for(int g=0;g<arr.length;g++){          //g=gap between i and j 
            for(int i=g,j=0;i<arr.length;i++,j++){
                System.out.print(arr[i][j]+" ");

            }

        }
        sc.close();
    }
    
}
