fun main() {
    val name = "Kotlin"  // val is readonly var is mutable
    println("Hello, $name !")

    for (i in 1..5) {
        println("i = $i")
    }

    exercise1()
    assignTypes()
    
}

fun exercise1() {
    val name = "Mary"
    val age = 20

    println("$name is $age years old")
}

fun assignTypes() {;
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}


