// 13. Given a list of integers, use the filter() function to extract all even numbers.
fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter { it % 2 == 0 }

    println(evenNumbers)
}
