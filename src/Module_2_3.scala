

class Module_2_3 {
  
}

/*
 * Extend the following BankAccount class to a CheckingAccount class that charges $1 for every deposit and withdrawal
 */

class BankAccount(initBal: Double) {
  
  private var balance = initBal
  
  def deposit(amount: Double) = {
    balance += amount;
    balance 
  }
  
  def withdraw(amount: Double) = {
    balance -= amount;
    balance 
  }
}

class CheckingAccount(initBal: Double,charge: Double) extends BankAccount(initBal) {
  
  override def deposit(amount: Double) = {
    super.deposit(amount-charge)
  }
  
  override def withdraw(amount: Double) = {
    super.withdraw(amount+charge)
  } 
}

object TestModule_2_3 {
  def main(args: Array[String]): Unit = {
    var myCheckAcc = new CheckingAccount(100.0,1.0)
    
    println("Balance after Depositing $20 to my Account :" + myCheckAcc.deposit(20.0))
    
    println("Balance Withdraw $10 from my Account :" + myCheckAcc.withdraw(10.0))
    
  }
}