/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Interfaces;

/**
 *
 * @author raik
 */
public class Interfaces4 {
  public static void main(String[] args) {
      Account acct = new BankAccount();
      acct.getId();
  }    
}


interface Account{
  public default void getId(){
      System.out.println("Account");
  }
}

interface PremiumAccount extends Account{
  public default void getId(){
      Account.super.getId();
      System.out.println("PremiumAccount");
  }
}

class BankAccount implements PremiumAccount{

    

}