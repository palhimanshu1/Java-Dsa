import java.util.*;
public class SpiralTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minRow =0;
        int minCol =0;
        int maxRow =arr.length-1;
        int maxCol =arr[0].length-1;

        int totalNumberOfElements = row*col;
        int count = 0;

        while (true) {
            //left wall
            for(int i=minRow,j=minCol;i<=maxRow && count<totalNumberOfElements;i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minCol++;

            //bottom wall
            for(int i=maxRow,j=minCol;j<=maxCol && count<totalNumberOfElements;j++){
                System.out.print(arr[i][j]+" ");

            }
            maxRow--;

            //rght wall
            for(int i =maxRow,j=maxCol;i>=minRow && count<totalNumberOfElements;i--){
                System.out.print(arr[i][j]+" ");
            }
            maxCol--;

            //top wall
            for(int i=minRow,j=maxCol;j>=minCol && count<totalNumberOfElements;j--){
                System.out.print(arr[i][j]+" ");
            }
            minRow++;
            sc.close();
        }
        
        
    }
    
}
