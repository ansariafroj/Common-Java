import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Physics Marks :");
        m1 = sc.nextByte();
         System.out.println("Enter Your Chemistry Marks :");
        m2 = sc.nextByte();
         System.out.println("Enter Your Mathematics Marks :");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3)/3.0f;
        if(avg>=30 && m1>=30 && m2>=30 && m3>=30){
            System.out.println("You are eligible for this course :");
        }else{
            System.out.println("You are not eligible for this course :");
        }

       
    }
    
}
