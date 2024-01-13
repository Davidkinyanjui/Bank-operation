package com.example.assignmentkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//This interface will declare methods that are common to all types of bank accounts
interface BankAccount {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
    fun getBalance(): Double
}

// Abstract class for common account features: This abstract class will implement the BankAccount interface
abstract class AbstractAccount(private var balance: Double) : BankAccount {

    override fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    override fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }

    override fun getBalance(): Double {
        return balance
    }

    abstract fun accountType(): String
}

// We have Created specific account types that extend the AbstractAccount
class SavingsAccount(balance: Double) : AbstractAccount(balance) {
    override fun accountType(): String {
        return "Savings Account"
    }
}

class CheckingAccount(balance: Double) : AbstractAccount(balance) {
    override fun accountType(): String {
        return "Checking Account"
    }
}

fun main() {
    val savingsAccount = SavingsAccount(0.0)
    val checkingAccount = CheckingAccount(0.0)

    savingsAccount.deposit(10000.0)
    checkingAccount.deposit(10000.0)

    savingsAccount.withdraw(2000.0)
    checkingAccount.withdraw(2000.0)

    println("Savings Account Balance: ${savingsAccount.getBalance()}")
    println("Checking Account Balance: ${checkingAccount.getBalance()}")

    val stockBroker = StockBroker()
    stockBroker.buyStock("KCB", 100)
    stockBroker.buyStock("BAT", 400)
}

class StockBroker {
    fun buyStock(stockName: String, quantity: Int) {
        println("Buying $quantity shares of $stockName")
    }
}
