import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a name:");
    String name=sc.nextLine();
    String original=name;
    String rev="";
    for(int i=name.length()-1;i>=0;i--){ 
        rev=rev+name.charAt(i);
      }
    //System.out.println(" "+rev);
   if(original.equals(rev)){
    System.out.println(original+" is a palindrome ");
   }else{
    System.out.println(original+" is not a palindrome");
   }
    
    }
     
 }