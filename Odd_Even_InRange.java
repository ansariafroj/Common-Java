
//sum of odd or even given in a range

import java.util.Scanner;

public class Odd_Even_InRange {
    public static void main(String[] args) {
        int n, i, sum = 0;
        System.out.println("Enter no of range : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0) {
            for (i = 0; i <= n; i = i + 2) {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Sum Of Even numbers : " + sum);
        } else {
            for (i = 1; i <= n; i=i+2) {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Sum Of Odd numbers : " + sum);
        }

    }
}
