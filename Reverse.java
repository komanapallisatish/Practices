import java.util.*;

public class Reverse {
    public static void main(String[] args) {
     StringBuffer sb1=new StringBuffer("hello world");
     sb1.reverse();
     System.out.println(sb1);

    String str="Satish";
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
       rev=rev+str.charAt(i);
    }
    System.out.println(rev);

    String str1="ABCDEF";
    char[] ch=str1.toCharArray();
    for(int i=str1.length()-1;i>=0;i--){
       System.out.print(ch[i]);
    }
    

    }
}