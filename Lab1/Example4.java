package Lab1;
import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of your choice : ");
        int a=sc.nextInt();
        if(a<2)System.out.println("no prime number ");
        for(int num=2;num<=a;num++) {
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(num);
        }

    }

}
