package Lab3;
import java.util.*;

public class Example3 {
    char[] vow = {'a','e','i','o','u',};
    char[] cons = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

    public String alterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++) {
            for(int j=0;j<20;j++) {
                if(sb.charAt(i)==cons[j]) {
                    sb.setCharAt(i, cons[j+1]);
                    break;
                }

            }
        }
        String s1 = new String(sb);
        return s1;
    }
    public static void main(String [] args) {
        char[] vow = {'a','e','i','o','u',};
        char[] cons = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        Example3 ex = new Example3();
        System.out.println(ex.alterString(str));
    }
}
