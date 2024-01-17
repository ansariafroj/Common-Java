import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements In Array :");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorting Order");
        for (int i = 0; i < 5; i++) {

            System.out.print(a[i] + " ");
        }

    }
}
