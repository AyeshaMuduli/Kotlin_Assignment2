// 15. Create an extension function String.addExclamation() that returns the string with an exclamation mark appended.
fun String.addExclamation(): String {
    return this + "!"
}

fun main() {

    println("Hello".addExclamation())
}
