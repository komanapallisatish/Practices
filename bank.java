import java.util.*;

public class bank {
    private int balance;
    bank(int balance){
      this.balance=balance;
    }
    public void deposit(int amount){
      balance=balance+amount;
      System.out.println("deposit:"+amount);
    }
    public void withdraw(int amount){
      balance=balance-amount;
      System.out.println("withdraw:"+amount);
    }
    public void showbalance(){
     System.out.println("balance:"+balance);
    }
    public static void main (String[] args) {
      bank b=new bank(300);
      b.deposit(200);
      b.withdraw(100);
      b.showbalance();
    }
    
}