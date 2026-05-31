// 24. Create a function buildFile(filename: String): File and use scope functions such as apply and also to configure and log file creation.
class File(
    val filename: String,
    var permission: String = ""
)

fun buildFile(filename: String): File {

    return File(filename).apply {
        permission = "Read/Write"
    }.also {
        println("File $filename created")
    }
}

fun main() {
    val file = buildFile("notes.txt")

    println(file.filename)
    println(file.permission)
}
