// 22. Extend the ScreenState sealed class by adding an Error state. Use a when expression to handle all possible states exhaustively.
sealed class ScreenState {
    object Loading : ScreenState()
    object Success : ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}

fun handle(state: ScreenState) {
    when (state) {
        is ScreenState.Loading -> println("Loading data...")
        is ScreenState.Success -> println("Data loaded successfully!")
        is ScreenState.Error -> println("Error: ${state.errorMsg}")
    }
}

fun main() {
    handle(ScreenState.Loading)
    handle(ScreenState.Success)
    handle(ScreenState.Error("Network Failed"))
}
