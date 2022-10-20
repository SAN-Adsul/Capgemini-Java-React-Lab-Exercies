package Lab1;
import java.util.*;

public class Example7 {
    static boolean checkNumber(int n) {
        boolean flag=true;
        int d1=n%10,d2;
        n/=10;
        while(n>0) {
            d2=n%10;
            if(d1<d2) {
                flag=false;
                break;
            }
            else {
                d1=d2;
                n/=10;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int a = sc.nextInt();
        System.out.println(checkNumber(a));

    }
}
