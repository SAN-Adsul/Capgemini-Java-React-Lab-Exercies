package Lab1;
import java.util.*;


public class Example6 {
    static int calculateDifference(int n) {
        int s1=0,s2=0;
        for(int i=1;i<=n;i++) {
            s1+=i*i;
            s2+=i;
        }
        return s1-(s2*s2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n=sc.nextInt();
        System.out.println(calculateDifference(n));
    }

}
