class dog implements animal{
  
   public void sound(){
    System.out.println("dog makes sound");

   }
   public void eat(){
    System.out.println("dog eats food");

   }
   public void run(){
    System.out.println("dog runs fast");
   }
   public void watch(){
	  System.out.println("dog watch movie");  
   }
   public static void main (String[] args) {
  dog d=new dog();
  d.sound();
  d.run();
  d.eat();
  d.watch();

  
}
  
  
}