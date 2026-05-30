// 1. Write a class BankAccout with a private var balance: Double. Provide a public function deposite(amount: double) that safely adds to the balance.
class BankAccount{
    private var balance: Double = 0.0
    fun deposite(amount: Double){
        balance+=amount
    }
    fun showBalance(){
        println("Balance: $balance")
    }
}

fun main(){
    val account=BankAccount()
    account.deposite(7000.0)
    account.showBalance()
}
