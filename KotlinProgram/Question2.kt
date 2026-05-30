// 2. Custom setter: Write a class Thermostat with a var temperature: Double. Give it a private set so it can only be modified from within the class
class Thermostat {

    var temperature: Double = 0.0
        private set

    fun setTemperature(value: Double) {
        temperature = value
    }
}

fun main() {
    val t = Thermostat()

    t.setTemperature(25.5)

    println("Temperature = ${t.temperature}")
}
