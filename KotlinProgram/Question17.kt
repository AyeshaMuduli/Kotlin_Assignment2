// 17. Use Kotlin’s let scope function to safely operate on a nullable string and print its length if it is not null.
fun main() {

    val input: String? = "Kotlin"

    input?.let {
        println(it.length)
    }
}
