package Lab2;
import java.util.*;

public class Example3 {

    static int[] getSorted(int[] arr) {
        int n=arr.length;
        StringBuffer[] str=new StringBuffer[n];
        for(int i=0;i<n;i++) {
            StringBuffer ele=new StringBuffer();
            arr[i]=Integer.parseInt(ele.append(String.valueOf(arr[i])).reverse().toString());
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        int[] sort_arr=getSorted(arr);
        for(int i=0;i<n;i++) {
            System.out.println(sort_arr[i]);
        }


    }
}
