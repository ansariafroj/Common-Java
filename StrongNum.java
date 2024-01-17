import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        int num, sum=0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            int fact=1;
            for(int i=1; i<=rem; i++){               // 145 = 1!+4!+5! = 145 Strong
                fact=fact*i;                         // 153 = 1!+5!+3! = 127 Not Strong
            }
            num=num/10;
            sum=sum+fact;
        }
        if(temp==sum)
        System.out.println("Number is Strong");
        else
        System.out.println("Number is Not Strong");
    }
    
}
