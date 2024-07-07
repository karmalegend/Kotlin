import kotlin.math.PI
import kotlin.math.pow

fun main(){
    println(circleArea(2))
    println( circleAreaSingleExpression(2))
    
    
    // exercise 3
    println(intervalInSeconds(hours =  1, minutes = 20, seconds = 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}

fun circleAreaSingleExpression(r: Int) : Double = PI * r.toDouble().pow(2.0);

fun circleArea(r: Int): Double {
    return PI * r.toDouble().pow(2.0);
}

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds
