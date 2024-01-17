import java.util.Scanner;

public class If_Else_Demo1 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your age :");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();

        if(age>=5 && age<=10){
            System.out.println("Child");
        }
         else if(age>10 && age<18){
            System.out.println("Not Adult");

         } else{
            System.out.println("Adult");
         }
       

    }
    
    
}
