import java.util.*;

public class KeyPadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        sc.close();
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // 678
        char ch = str.charAt(0); // 6
        String ros = str.substring(1); // 78

        ArrayList<String> rres = getKPC(ros);

        ArrayList<String> mres = new ArrayList<>();

        String codeForCh = codes[ch - '0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
            for (String rstr : rres) {
                mres.add(chCode + rstr);
            }

        }
        return mres;

    }

}
