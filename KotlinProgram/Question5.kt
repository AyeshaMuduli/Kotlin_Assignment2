// 5. Abstraction: Write an abstract class Animal with an abstract method makeSound(). Write a cat class that inherits from it and implement the 

abstract class Animal {

    abstract fun makeSound()
}

class Cat : Animal() {

    override fun makeSound() {
        println("Meow")
    }
}

fun main() {
    val cat = Cat()

    cat.makeSound()
}
