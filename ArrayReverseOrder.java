import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter Elements In Array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        System.out.println("Array Elements :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Array Reverse Elements :");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");

        }
    }
}
