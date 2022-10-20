package Lab6;
import java.util.*;

public class Example4 {
    public static HashMap getStudents(HashMap<String, Integer> hmap) {

        HashMap<String, String> hMap = new HashMap<>();

        for (Map.Entry e : hmap.entrySet()) {

            int m = (int)e.getValue();

            if(m >=70 && m < 80) {

                hMap.put((String)e.getKey(), "Bronze MEDAL");

            } else if(m >=80 && m < 90) {
                hMap.put((String)e.getKey(), "Silver MEDAL");

            } else {
                if(m >= 90 && m <= 100) {
                    hMap.put((String)e.getKey(), "Gold MEDAL");
                }
            }
        }

        return hMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Harry", 70);
        map.put("Sanket", 81);
        map.put("Pratik", 92);
        map.put("Ramesh", 52);
        System.out.println(getStudents(map));
    }
}
