import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
      int n, sum=0;
      System.out.println("Enter number : ");
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      for(int i=1; i<n; i++){
        if(n%i==0){
            sum=sum+i;

        }
      }
      if(n==sum)
      System.out.println("Perfect ");                 // 6=1+2+3=Perfect
                                                        // 8=1+2+4=Not Perfect
      else
      System.out.println("Not perfect");
      
    }

}
