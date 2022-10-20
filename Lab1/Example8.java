package Lab1;
import java.util.*;
public class Example8 {
    static boolean checkNumber(int n){
        int r=0;
        boolean flag=true;
        while(r==0) {
            if(n%2!=0) {
                flag=false;
                break;
            }
            n/=2;
            if(n==1)
                break;
        }

        return flag;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of your choice : ");
        int a = sc.nextInt();
        System.out.println(checkNumber(a));
    }
}
