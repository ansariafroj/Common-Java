import java.util.Scanner;

public class If_Else_ladder {
    public static void main(String[] args) {

        int marks;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your number :");
        
        marks = obj.nextInt();
        if(marks>80){
            System.out.println("Topper");

        } 
        else if(marks<80 && marks>=60){
            System.out.println("First");

        }
        else if(marks<60 && marks>=40){
            System.out.println("Second");
            
        } else{
            System.out.println("Fail");
        }

        
    }
    
}
