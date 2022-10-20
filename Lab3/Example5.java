package Lab3;
import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sentence>");
        String s = sc.nextLine();

        char a[] = s.toCharArray();
        System.out.println("No of Chars"+a.length);

        String a1[] = s.split("\r\n|\r|\n");
        System.out.println("No. of Words"+a1.length);

        String a2[] = s.split(" ");
        System.out.println("No. of Lines"+a2.length);
        sc.close();
    }
}
