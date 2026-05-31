// 21. Create a product inventory represented as a list. Use map() to apply a 10% discount to all products and then use filter() to select products whose price remains above $50.
data class Product(val name: String, val price: Double)

fun main() {
    val inventory = listOf(
        Product("Laptop", 1000.0),
        Product("Mouse", 25.0),
        Product("Keyboard", 60.0)
    )

    val result = inventory
        .map { Product(it.name, it.price * 0.9) }
        .filter { it.price > 50 }

    println(result)
}
