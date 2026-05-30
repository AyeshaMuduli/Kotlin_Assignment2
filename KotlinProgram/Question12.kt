// 12. Create a higher-order function executeTwice(action: () -> Unit) that executes the provided function two times.
fun executeTwice(action: () -> Unit) {
    action()
    action()
}

fun main() {

    executeTwice {
        println("Hello")
    }
}
