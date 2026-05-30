// 10. Write a sealed class ScreenState. Add an object Loading and a data class Success(val data: String) that inherits from it
sealed class ScreenState

object Loading : ScreenState()

data class Success(val data: String) : ScreenState()

fun main() {
    val state: ScreenState = Success("Data Loaded")

    println(state)
}
