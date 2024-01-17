import java.util.Scanner;

public class Switch_Demo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int ch;

        System.out.println("Enter Your Choices :");
        Scanner r = new Scanner(System.in);
        ch = r.nextInt();
        switch(ch){
            case 1 : System.out.println("Sum " +(a+b));
            break;
            case 2 : System.out.println("Sub " +(a-b));
            break;
            case 3 : System.out.println("Multi " +(a*b));
            break;
            case 4 : System.out.println("Div" +(a/b));
            break;
            default :
             System.out.println("Invalid choice!");
        }   
            System.out.println("You are out from switch!");
        
    }
    
}
