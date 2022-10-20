package Lab1;
import java.util.*;

public class Example1 {
    static int sum_of_cube_of_digits(int n, int a) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow((a % 10), 3);
            a /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits : ");
        int n = sc.nextInt();
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Sum of the cube of digits of the number is: " + sum_of_cube_of_digits(n, a));
    }
}