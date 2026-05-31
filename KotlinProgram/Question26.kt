// 26. E-Commerce Checkout Pipeline
//Build a small checkout system that:
//Uses a CartItem data class.
//Includes an extension function calculateTotal().
//Defines a sealed class CheckoutResult.
//Uses a singleton PaymentProcessor.
//Processes multiple carts concurrently using coroutines.
//Displays results using a when expression.

import kotlinx.coroutines.*
import kotlin.random.Random

data class CartItem(
    val name: String,
    val price: Double,
    val quantity: Int
)

fun List<CartItem>.calculateTotal(): Double {
    var total = 0.0

    for (item in this) {
        total += item.price * item.quantity
    }

    return total
}

sealed class CheckoutResult {
    object Processing : CheckoutResult()

    data class Success(
        val receiptId: String
    ) : CheckoutResult()

    data class Failed(
        val reason: String
    ) : CheckoutResult()
}

object PaymentProcessor {

    suspend fun processPayment(
        cart: List<CartItem>
    ): CheckoutResult {

        delay(2000)

        val total = cart.calculateTotal()

        return if (total > 1000) {
            CheckoutResult.Failed(
                "Insufficient funds for large transaction"
            )
        } else {
            CheckoutResult.Success(
                "TXN-${Random.nextInt(1000, 9999)}"
            )
        }
    }
}

fun main() = runBlocking {

    val cheapCart = listOf(
        CartItem("Book", 100.0, 2),
        CartItem("Pen", 20.0, 3)
    )

    val expensiveCart = listOf(
        CartItem("Laptop", 1200.0, 1)
    )

    val job1 = launch {

        val result =
            PaymentProcessor.processPayment(cheapCart)

        when (result) {
            is CheckoutResult.Success ->
                println("Cheap Cart Success: ${result.receiptId}")

            is CheckoutResult.Failed ->
                println("Cheap Cart Failed: ${result.reason}")

            CheckoutResult.Processing ->
                println("Processing...")
        }
    }

    val job2 = launch {

        val result =
            PaymentProcessor.processPayment(expensiveCart)

        when (result) {
            is CheckoutResult.Success ->
                println("Expensive Cart Success: ${result.receiptId}")

            is CheckoutResult.Failed ->
                println("Expensive Cart Failed: ${result.reason}")

            CheckoutResult.Processing ->
                println("Processing...")
        }
    }

    job1.join()
    job2.join()
}
