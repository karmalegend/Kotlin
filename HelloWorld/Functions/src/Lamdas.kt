fun main(){
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { x -> "$prefix/$id/$x" }
    println(urls)
    
    repeatN(5) { println("Hello") }

    val test: () -> Unit = { println("abc") }
    test()
    test.invoke() // invoke seems to have no implementation or declaration not sure where it's coming from?
    
    val appendX: (String) -> String = { s -> s + 'x' }
    val listOfWords = listOf("apple", "banana", "kiwi", "kumquat");

    listOfWords.map(appendX).forEach(::println)
    
    val startingWithKandI = listOfWords.filter { x -> x[0].lowercaseChar() == 'k' }.filter { x -> x[1].lowercaseChar() == 'i' }
    println(startingWithKandI)

    val startingWithKandI2 = listOfWords.filter { x -> x[0].lowercaseChar() == 'k' && x[1].lowercaseChar() == 'i' } // this is basically linq? but with extra steps from the looks of it.
    println(startingWithKandI2)

    val listOfWords2 = listOf("apple", "banana", "kiwi", "kumquat")
    println(listOfWords2.firstOrNull { it[0] == 'k' })
    
    val k = listOfWords2.firstOrNull { it[0] == 'k' };
}


fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) action()
}
