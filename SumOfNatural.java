           // Sum of first natural numbers

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        int n , sum = 0;
        System.out.println("Enter no of terms :");
        Scanner ref = new Scanner (System.in);
        n = ref.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println(i + " ");
            sum = sum+i;
        }
        System.out.println("Addition : " +sum);
    }
    
}
