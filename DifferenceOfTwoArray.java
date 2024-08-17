import java.util.*;
public class DifferenceOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        int[] diff = new int[n1>n2?n1:n2];
        int carry=0;

        int i=arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;

        while(k>=0){
            int digit = 0;
            int arr1Value = i>=0?arr1[i]:0;
            if(arr2[j] + carry >= arr1Value){            //arr1[i] --> replaced by arr1Value beacuse 1000 -1 then in array1 i.e value = 1 after first index there is no other number to be subtract from array 2 hence we use 0 there
                digit = arr2[j] + carry - arr1Value;
                carry=0;
            }else{
                digit = arr2[j] + carry +10 - arr1Value;
                carry=-1;
            }

            diff[k]= digit;
            i--;
            j--;
            k--;

        }
        // abb hame preceding zero ko hatana hai
        int index = 0;
        while(index<diff.length){
            if(diff[index] == 0){
                index++;
            }else{
                break;
            }
        }

        while(index<diff.length){
            System.out.print(diff[index]);
            index++;
        }
        sc.close();
    }   
    
}
