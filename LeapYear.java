import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :");
        n=sc.nextInt();
       
            if(n%400==0){
                System.out.println("This Year is a Leap Year " + " ");

            }
            else if (n%4==0 && n%100!=0){
                System.out.println("This Year is a leap Year " + " ");
            }
            else{
                System.out.println("This Year is not a leap year");
            }
        
    }
    
}
