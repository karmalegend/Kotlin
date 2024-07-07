fun main() {
    exerciseOne()
    exerciseTwo()
    exerciseThree()
}

fun exerciseThree() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three");
    val n = 2
    println("$n is spelt as '${number2word[n]}'") // map is dict dict is legacy java dont use dict.
}

fun exerciseTwo() { 
    val supported = setOf("HTTP", "HTTPS", "FTP") // set is unordered and unique items only.
    val requested = "smtp"
    val isSupported = supported.contains(requested);
    println("Support for $requested: $isSupported")
}

fun exerciseOne() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("Total count is ${redNumbers.size + greenNumbers.size}")
}
