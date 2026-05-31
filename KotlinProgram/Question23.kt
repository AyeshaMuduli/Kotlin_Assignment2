// 23. Create two suspend functions: fetchUserData() and fetchAppConfig(). Run both functions concurrently using async and display the results.
import kotlinx.coroutines.*

suspend fun fetchUserData(): String {
    delay(1000)
    return "Alice"
}

suspend fun fetchAppConfig(): String {
    delay(2000)
    return "Dark Mode"
}

fun main() = runBlocking {

    val user = async { fetchUserData() }
    val config = async { fetchAppConfig() }

    println("User: ${user.await()}")
    println("Config: ${config.await()}")
}
