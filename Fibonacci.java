import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int term, a = 0, b = 1, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term : ");
        term = sc.nextInt();
        for (int i = 0; i <= term; i++) {
            System.out.print(a + " ");
            C = a + b;
            a = b;
            b = C;
        }
    }

}
