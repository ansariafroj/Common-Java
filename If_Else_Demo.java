import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter Your age :");
        Scanner r = new Scanner(System.in);
        age = r.nextInt();

        if(age>=18){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

    }
    
}
