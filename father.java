public class father extends grandfather {
     public void gold(){
      System.out.println("father gold");
     }
     public static void main (String[] args) {
      father f=new father();
      f.land();
	  f.gold();
	  son s=new son();
	  s.land();
	  s.bike();
     }
  
}