import java.util.*;
public class ShellRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();  //shell = s
        int r = sc.nextInt();  //rotate = r
        rotateShell(arr,s,r);
        display(arr);
        sc.close();
    }

    public static void rotateShell(int[][] arr,int s, int r){
        int[] oned = fillOnedFromShell(arr,s);
        rotate(oned,r);
        fillShellFromOned(arr,s,oned);
    }


    public static int[] fillOnedFromShell(int[][] arr, int s){
        int minr =s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        // int size = 2*(maxr - minr +1) + 2*(maxc - minc +1) -4;     //leftWall = maxRow-minRow +1, bottomWall = maxCol-minCol +1, rightWall = leftwall top wall = bottom wall and -4 karenge kyuki corner repeat honge 2 baar isliye unko nikal ne k liye -4. after solving equation we get new size down below
        int size =2*(maxr - minr + maxc -minc);
        int[] oned = new int[size];

        //lw
        int index=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            oned[index] =arr[i][j];
            index++;

        }

        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            oned[index] = arr[i][j];
        }

        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            oned[index] =arr[i][j];
            index++;

        }

        //tw
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            oned[index] =arr[i][j];
            index++;

        }
        return oned;

    }

    public static void fillShellFromOned(int[][] arr,int s, int[] oned) {
        int minr =s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        //lw
        int index=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j] = oned[index];
            index++;

        }

        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j]=oned[index];
        }

        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j]=oned[index] ;
            index++;

        }

        //tw
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            arr[i][j]=oned[index];
            index++;

        }
        

        
    }
    public static void rotate(int[] oned,int r){
        r = r%oned.length;
        if(r<0){
            r = r+oned.length;
        }

        reverse(oned ,0,oned.length-r-1);

        reverse(oned ,oned.length-r,oned.length-1);

        reverse(oned,0,oned.length-1);

    }

    public static void reverse(int[] oned,int li,int ri){
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }


    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
