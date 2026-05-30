// 19. Use the launch coroutine builder inside runBlocking to execute a background task.
mport kotlinx.coroutines.*

fun main() = runBlocking {

    launch {
        println("Background task finished")
    }
}
