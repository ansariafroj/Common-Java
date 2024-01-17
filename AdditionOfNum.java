import java.util.Scanner;

public class AdditionOfNum {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition : " + (a + b));
    }
}