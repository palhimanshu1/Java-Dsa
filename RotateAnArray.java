import java.util.*;

public class RotateAnArray {

    public static void reverse(int[] arr,int i,int j){
        int li = i;
        int ri = j;
        while(li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    
    }
    
    public static void rotate(int[] arr,int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        //part1 reverse
        reverse(arr,0,arr.length-k-1);
    
        //part2 reverse
        reverse(arr, arr.length-k, arr.length-1);
    
        //part1+2 reverse
        reverse(arr, 0, arr.length-1);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate(arr, k);
        for(int val:arr){
            System.out.print(val);
        }
        sc.close();

    }
    
}
