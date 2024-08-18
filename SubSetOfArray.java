import java.util.*;
public class SubSetOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int limit = (int)Math.pow(2,arr.length);
        for(int i=0;i<limit;i++){
            String set = "";
            int temp = i;
            for(int j=arr.length-1;j>=0;j--){
                int remainder = temp%2;
                temp=temp/2;
                if(remainder==0){
                    set = "_\t"+set;

                }else{
                    set = arr[j]+"\t"+set;

                }

            }
            System.out.println(set);
        }
        sc.close();
    }
}
