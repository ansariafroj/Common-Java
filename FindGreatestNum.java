import java.util.Scanner;

public class FindGreatestNum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        a=sc.nextInt();
        System.out.println("Enter Second Number :");
        b=sc.nextInt();
        System.out.println("Enter Third Number :");
        c=sc.nextInt();
       
        if(a>b && a>c){
           
                System.out.println(a + " Is a largest Number ");
                
            } else if(b>a && b>c) {
                
                System.out.println(b + " Is a largest number ");
            }else{
                System.out.println(c + " Is a largest number ");
            }
           
        } 

        }


    

    

