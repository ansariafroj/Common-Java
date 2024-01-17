
          // Print Even no in range

import java.util.Scanner;

public class Even_No_InRange {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no of range :");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for(int i = 0; i<=n; i = i+2){   // for(int i = 1; i<=n; i = i+2) // for odd
            System.out.println(i);
        }
    }
    
}
