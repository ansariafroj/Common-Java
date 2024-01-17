import java.util.Scanner;

public class ChekPrime {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter any number :");
        n = ref.nextInt();
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                count ++;
            }
        }
        if(count==2)
        System.out.println("Prime");
        else
        System.out.println("Not prime");
    }
    
}
