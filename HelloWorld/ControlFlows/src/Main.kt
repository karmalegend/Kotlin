fun main() {
    // when is a switch expression, but it uses -> instead of : 
    exerciseOne()
    exerciseTwo()
    exerciseThree()
    exerciseFour()

}

fun exerciseFour() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith('l',true)) println(word)
    }
}

fun exerciseThree() {
   // fizz buzz
    for(i in 1..100){
        if(i % 3 == 0 && i % 5 == 0) println("FizzBuzz")
        if (i % 5 == 0) println("Buzz")
        if (i % 3 ==0) println("Fizz")
    }
    // jetbrains solution:
//    fun main() {
//        for (number in 1..100) {
//            println(
//                when {
//                    number % 15 == 0 -> "fizzbuzz"
//                    number % 3 == 0 -> "fizz"
//                    number % 5 == 0 -> "buzz"
//                    else -> "$number"
//                }
//            )
//        }
//    }
}

fun exerciseTwo() {
    var pizzaSlices = 0
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun exerciseOne() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            "Other" -> "There is no such button"
            else -> "this syntax feels weird."
        }
    )
}


//Before talking about loops, it's useful to know how to construct ranges for loops to iterate over.
//
//The most common way to create a range in Kotlin is to use the .. operator. For example, 1..4 is equivalent to 1, 2, 3, 4.
//
//To declare a range that doesn't include the end value, use the ..< operator. For example, 1..<4 is equivalent to 1, 2, 3.
//
//To declare a range in reverse order, use downTo. For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.
//
//To declare a range that increments in a step that isn't 1, use step and your desired increment value. For example, 1..5 step 2 is equivalent to 1, 3, 5.
//
//You can also do the same with Char ranges:
//
//'a'..'d' is equivalent to 'a', 'b', 'c', 'd'
//
//'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'


// while and do-while are same as c#.
