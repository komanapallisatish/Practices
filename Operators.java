//operators
// //arithemetic operator
// public class Main{
//     public static void main(String[] arg){
//         int a=20;
//         int b=10;
//         System.out.println("addition:"+(a+b));
//          System.out.println("subtraction:"+(a-b));
//           System.out.println("multiplication:"+(a*b));
//           System.out.println("division:"+(a/b));
//             System.out.println("modolous:"+(a%b));
//     }
// }

// //Assignment operator
// public class Main{
//      public static void main(String[] arg){
//          int a=3;
//           System.out.println("a+="+(a+=3));
//             System.out.println("a-="+(a-=3));
//              System.out.println("a*="+(a*=3));
//               System.out.println("a/="+(a/=3));
         
//      }
// }

// //Relational operator
// public class Main{
//     public static void main(String[] arg){
//         int a=10;
//         int b=12;
//          System.out.println(""+(a>b));
//           System.out.println(""+(a<b));
//          System.out.println(""+(a==b));
//           System.out.println(""+(a>=b));
//             System.out.println(""+(a<=b));
//               System.out.println(""+(a!=b));
        
//     }  
// }

// //unary operator
// public class Main{
//     public static void main(String[] arg){
//         int a=5;
//         int b=6;
//         System.out.println("post-incre: "+(a++));
//         System.out.println("pre-incre: "+(++a));
//         System.out.println("post-decre: "+(b--));
//         System.out.println("pre-decre: "+(--b));
//         System.out.println(" "+(~a));
//         System.out.println(!true);
        
//     }
    
// }
// //bitwise operator
// public class Main{
//     public static void main(String[] args){
//         int a=3;
//         int b=4;
//         System.out.println(""+(a&b));
//         System.out.println(""+(a|b));
//         System.out.println(""+(a^b));
//          System.out.println(" "+(a>>2));
//           System.out.println(""+(a>>>2));
//           System.out.println(""+(a<<2));
//     }
// }

// //logical operator
// public class Main{
//     public static void main(String[] args){
//         boolean a=true;
//         boolean b=false;
//          System.out.println(""+(a&&b));
//           System.out.println(""+(a||b));
//            System.out.println(""+(!b));
//     }
// }

// //ternary operator
// public class Main{
//       public static void main(String[] args){
//           int age=18;
//           String t=age<=18?"eligible to vote":"not eligible to vote";
//           System.out.println(t);
//       }
// }

//nested ternary
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a value");
//         int n=sc.nextInt();
//         String t=(n<18)?((n<=5)?"baby":(n<=12)?"childrens":"teens"):((n<30)?"youth":(n<=45)?"uncles":"senior citizens");
//         System.out.println(t);

//     }
// }