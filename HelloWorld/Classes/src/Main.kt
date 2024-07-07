import kotlin.math.ceil
import kotlin.random.Random

fun main() {
    val mike = Employee("Mike", 3200.0)
    println(mike)
    mike.salary += 1000
    println(mike)


    val peter = Employee2("Mike", 3200.0)
    println(peter)
//    peter.salary += 1000 compiler throws on val changes. not entirely sure yet on when to use data class over class. 
//    I guess it's nice for class "equality" aka equivalency
    println(peter)


    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minimumSalary = 50
    empGen.maximumSalary = 100
    println(empGen.generateEmployee())
}

class RandomEmployeeGenerator(var minimumSalary: Int, var maximumSalary: Int) { // val is not necessarily just immutable but seems to be the same as the init keyword in ctor context.
    val names = setOf("Alex", "Bella", "Casey", "David", "Emma", "Skyler")
    
    fun generateEmployee(): Employee {
        val name = names.random()
        val salary = ceil(Random.nextDouble(minimumSalary.toDouble(),maximumSalary.toDouble() + 0.1))
        return Employee(name, salary)
    }


}

//fun RandomEmployeeGenerator(i: Int, i1: Int): Any { // okay it appears we have an Any type that can be used which seems horrendeous and the equivalant of object?
//
//}


