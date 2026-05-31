// 25. Create an abstract class Shape with subclasses Circle and Square. Implement a function processShapes() that accepts a list of shapes and a higher-order function to process them.
abstract class Shape {
    abstract fun calculateArea(): Double
}
class Circle(private val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
class Square(private val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}
fun processShapes(
    shapes: List<Shape>,
    action: (Double) -> Unit
) {
    for (shape in shapes) {
        action(shape.calculateArea())
    }
}
fun main() {
    val shapes = listOf(
        Circle(5.0),
        Square(4.0)
    )
    processShapes(shapes) {
        println("Area = $it")
    }
}
