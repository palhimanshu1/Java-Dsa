import java.util.*;;
/**
 * inverse
 */
public class inverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int inverse =0;
        int op=1;
        while(n!=0){
            int od=n%10;
            int ip=od;
            int id=op;

            inverse= inverse+ id*(int)Math.pow(10, ip-1);
            n=n/10;
            op++;
        }
        sc.close();
        System.out.println(inverse);

    }
}
