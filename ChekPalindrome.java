import java.util.Scanner;

public class ChekPalindrome {
    public static void main(String[] args) {
        int n, S=0, C, r;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter Your number :");
        n = ref.nextInt();
        C = n;
        while(n>0){
            r = n%10;
            S = (S*10)+r;
            n = n/10;
        }
        if(C==S)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");

        }
    
}
