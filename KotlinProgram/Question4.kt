// 4. Super constructor: Write a parent class Employee(val baseSalary: Int). write a child class Manager that inherits from Employee and correctly passes 80000 up to the super constructor.
open class Employee(val baseSalary: Int)

class Manager(baseSalary: Int) : Employee(baseSalary)

fun main() {
    val manager = Manager(80000)
    println("Salary = ${manager.baseSalary}")
}
