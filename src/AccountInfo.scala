
/**

Write a class AccountInfo with methods deposit and withdraw, and a read-only property balance 

*/
 

class AccountInfo {
  def deposit(amount: Double) = {
    println("This is a deposit method depositing " + amount)
    balance = balance + amount
  }
  def withdraw(amount: Double) = {
    println("This is a withdraw method withdrawing " + amount)
    balance = balance - amount
  }
  private var balance: Double = 100.00
  
  def getBalance(): Double = {
    return balance
  }
}

object TestAccountInfo {
  def main(args: Array[String]): Unit = {
    var acc1 =  new AccountInfo
    acc1.deposit(20.00)
    var currBalance: Double = acc1.getBalance()
    println ("Current Balance is " + currBalance)
    acc1.withdraw(40.00)
    currBalance = acc1.getBalance()
    println ("Current Balance is " + currBalance)
  }
}