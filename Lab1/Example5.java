package Lab1;

import java.util.*;

public class Example5 {
    static int calculateSum(int n) {
        int num=3,sum=0;
        while(n>0) {
            int flag=0;
            while(flag==0) {
                if(num%3==0 || num%5==0) {
                    sum+=num;
                    flag=1;
                    num++;
                }
                else
                    num++;
            }
            if(flag==1) {
                n--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want : ");
        int a =sc.nextInt();
        System.out.println(calculateSum(a));
        sc.close();
    }
}
