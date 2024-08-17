import java.util.*;
public class InverseOfArray {

    public static void display(int[] arr){
        for(int val:arr){
            System.out.println(val);
        }
    }

    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            inv[value] = i;
        }
        return inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] inverseArray = inverse(arr);
        display(inverseArray);
        sc.close();
    }
    
}

