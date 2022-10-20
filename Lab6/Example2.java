package Lab6;
import java.util.*;

public class Example2 {
    public static HashMap countChars(char[] a) {

        HashMap <Character, Integer> hMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (hMap.containsKey(a[i])){
                int count = hMap.get(a[i]);

                hMap.put(a[i], ++count);

            } else {
                hMap.put(a[i],1);
            }
        }
        return hMap;
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter Char Arr:");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(countChars(s.toCharArray()));
        }

    }
}
