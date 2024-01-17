import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter Your choices :");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
             System.out.println("");
            
        }
        
    } 
}
