import java.util.*;

public class RLE {
    public static void main(String[] args) {
      String str="aabbbccccddddd";
      String result="";
	 // StringBuffer result=new StringBuffer();
      for(int i=0;i<str.length();i++){
        int count=1;
        while(i+1<str.length() && (str.charAt(i)==str.charAt(i+1))){
          count++;
          i++;
        }
        result=result+str.charAt(i)+""+count;
       //  result.append(str.charAt(i)).append(count);
   
      }
      System.out.println(result);
	 // return result.toString();
   
    }
}