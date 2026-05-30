// 18. Create a suspend function fetchWeather() that simulates fetching weather data by delaying for one second before returning a result.
import kotlinx.coroutines.*

suspend fun fetchWeather(): String {
    delay(1000)
    return "Sunny"
}

fun main() = runBlocking {

    println(fetchWeather())
}
