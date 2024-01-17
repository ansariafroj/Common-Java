import java.util.Scanner;               

public class Armstrong {
    public static void main(String[] args) {
        int n, arm=0, rem, c;
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt(); 
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;                     // 153 = 1^3+5^3+3^ = 153 Armstrong number
            n=n/10;                                    // 123 = 1^3+2^3+3^ = 36 Not Armstrong number
        }
        if(c==arm)
        System.out.println("Armstrong number : ");
        else
        System.out.println("Not Armstrong number : ");
    }
    
}                                        
