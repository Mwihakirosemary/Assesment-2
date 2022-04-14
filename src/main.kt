fun main(){
    var bank = CurrentAmount("35757385","kotlin account",5000)
    bank.deposit(200.50)
    bank.balance
    bank.withdraw(1200.50)
    bank.balance
    bank.accountNumber
    var x =  bank.accountNumber
    var y =  bank.balance
    var z =  bank.accountName
    var m = "Account number $x with balance is $y is operated by $z."
    println(m)

    var savings = SavingsAccount("35757385","kotlin account",5000,3)
    savings.withdrawals

    var pdct = Product("Apple",3.2,50,"Vegetables")
    var pdct1 = Product("Soap",10.2,100,"Hygiene")
    var pdct2 = Product("Bag",7.2,200,"Other")


    even("banana")
}

   /* 1.Create a classCurrentAccount with the following attributes:account
    number, account name, balance. It has the following functions:
    a.deposit(amount: Double) - Increments the balance bythe
            amount deposited
            b.withdraw(amount: Double) - Decrements the balanceby the
            amount withdrawn
            c.details() - Prints out the account number and balanceand
    name in this format: “Account number x with balance y is
    operated by z”*/
open class CurrentAmount(var accountNumber: String,var accountName: String,var balance: Int){
    fun deposit(amount: Double){
        var blnc = balance + amount
        println(blnc)
        }
    fun withdraw(amount: Double){
        var minus = balance - amount
        println(minus)
    }
    fun details(){
    }
}
/*Create another classSavingsAccount. It has the samefunctions and
attributes as the current account except for one attribute,
withdrawals: Int. Withdrawals is a counter variablethat is used to
keep track of how many withdrawals have been made from the account
in a year. The only other difference is that the savings account
withdraw() method first checks if the number of withdrawalsis less
than 4 for it to allow one to withdraw money from the account. It also
increments the withdrawals attribute after a successful withdrawal
(5points)
3.A product is represented by a data class with these attributes: name,
weight, price, category. Category can either be groceries, hygiene or
other. Write a function that takes in a product and uses a when
statement to assign each product to a list based on its category
(3 points)
4.Write a function that given a string returns a string composed of only
the characters in even indices. For example given “banana” it will return "bnn"*/
class SavingsAccount(accountNumber: String,accountName: String,balance: Int,var withdrawals: Int){
    fun withdraw(){
        var x = 0
        if (withdrawals < 4){
            println(withdrawals)
        }
    }
}
data class Product(var name: String,var weight: Double,var price: Int,var category: String){
    fun store(sum: String){

    }
}
fun even(word: String){
    var noun = 1
    word.forEach { noun1 ->
        if (noun%2 !==0){
            println(noun1.toString())
        }
    }





}