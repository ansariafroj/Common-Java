import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
     int n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number : ");
     n=sc.nextInt();
     for(int i=1; i<=n; i++){
        if(n%i==0)
        System.out.print(i + " ");
     }

    }

}
