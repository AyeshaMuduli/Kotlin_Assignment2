// 20. Use the async coroutine builder to perform a computation and retrieve the result using await().
import kotlinx.coroutines.*

fun main() = runBlocking {

    val result = async {
        5 + 5
    }

    println(result.await())
}
