import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> res = gss(str); // res ==result
        System.out.println(res);
        sc.close();

    }

    public static ArrayList<String> gss(String str) { // gss == getSubSequence

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;

        }
        char ch = str.charAt(0); // first string character
        String ros = str.substring(1); // ros== rest of string other than first
        ArrayList<String> rres = gss(ros); // rres = return result

        ArrayList<String> mres = new ArrayList<>(); // mres = my result
        for (String rstr : rres) {
            mres.add("" + rstr);

        }
        for (String rstr : rres) {

            mres.add(ch + rstr);
        }

        return mres;
    }

}
