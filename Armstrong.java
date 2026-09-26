import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=n;
      int temp=n;
      int sum=0;
      int count=0;
      while(m!=0){
         int num=m%10;
         count++;
         m=m/10;
      }
      while(n!=0){
        int digit=n%10;
        sum=sum+(int)Math.pow(digit,count);
       n=n/10;

      }
      if(temp==sum){
        System.out.print("Armstrong");

      }else{
        System.out.print("not Armstrong");
      }
      
    }
}