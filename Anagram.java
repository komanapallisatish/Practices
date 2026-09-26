import java.util.*;

public class Anagram {
    public static void main(String[] args) {
     String s1="Listen";
     String s2="Silent";
     char[] ch=new char[256];
     s1=s1.toLowerCase();
     s2=s2.toLowerCase();
     for(int i=0;i<s1.length();i++){
      ch[s1.charAt(i)]++;
     }
     for(int i=0;i<s2.length();i++){
      ch[s2.charAt(i)]--;
     }
     for(int i=0;i<256;i++){
     if(ch[i]!=0){
      System.out.println(" not anagram");
      return;
     }
     }
     System.out.println("  anagram");

    
    }
     
 }