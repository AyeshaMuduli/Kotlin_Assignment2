// 11. Write a variable val Square: Int-> that holds a lambda function. Use the it keyword to return the square of the input number
fun main() {

    val square: (Int) -> Int = {
        it * it
    }

    println(square(5))
}
