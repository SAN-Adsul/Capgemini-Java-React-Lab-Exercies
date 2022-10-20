package Lab3;
import java.util.*;

public class Example1 {
    public static void main(String [] args) {
        int sum = 0;
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line");
        String str = sc.nextLine();
        StringTokenizer tok = new StringTokenizer(str," ");
        System.out.println(str);
        while(tok.hasMoreTokens()) {
            st = tok.nextToken();
            System.out.println(st);

            sum = sum + (Integer.parseInt(st));


        }
        System.out.println("SUM : " + sum);

    }
}
