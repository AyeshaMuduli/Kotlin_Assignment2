// 14. Given a list of strings such as fruit names, use the map() function to create a new list containing the length of each string.
fun main() {

    val fruits = listOf("apple", "banana")

    val lengths = fruits.map { it.length }

    println(lengths)
}
