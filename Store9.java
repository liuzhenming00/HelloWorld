public class Store9 {
  
  int balance;
  
  public Store9(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }
  
  public void deposit(int amountToDeposit){
	
	  System.out.println("You just deposited " + amountToDeposit);
	   balance = amountToDeposit + balance;
 
  
  }
  
  public int withdraw(int amountToWithdraw){
	
    
    System.out.println("You just withdrew " + amountToWithdraw);
    balance = balance - amountToWithdraw;
    return amountToWithdraw;
    
  }
  
  public String toString(){
    return "This is a savings account with " + balance + " saved.";
  }
   
  
  public static void main(String[] args){
	  Store9 savings = new Store9(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    System.out.println(savings);
  }       
}
