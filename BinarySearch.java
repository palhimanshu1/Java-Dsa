import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("enter the data value");
        int data = sc.nextInt();
        int low=0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(data<arr[mid]){
                high = mid-1;
            }else if(data>arr[mid]){
                low = mid+1;
            }else{
                System.out.println(arr[mid]+": Found at index "+mid);
                return;
            }
        }
        
        System.out.println(-1);

        
        
    }
    
}
