// 9. Write a class IDGenerator. Inside it create a companion objectwith a variable currentid starting at zero and a function getNextid() that increments and return it
class IDGenerator {

    companion object {
        var currentId = 0

        fun getNextId(): Int {
            currentId++
            return currentId
        }
    }
}

fun main() {
    println(IDGenerator.getNextId())
    println(IDGenerator.getNextId())
}
