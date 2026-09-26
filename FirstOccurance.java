import java.util.*;

public class FirstOccurance {
    public static void main(String[] args) {
      String mainstr="greeksforgreeks";
      String part="for";
      int n=mainstr.length();
      int m=part.length();
      for(int i=0;i<=n-m;i++){
        if(mainstr.charAt(i)==part.charAt(0)){
          String substring=mainstr.substring(i,i+m);
          if(substring.equals(part)){
            System.out.print(i);
          }else{
            System.out.print("-1");
          }
        }
      }
   
    }
}