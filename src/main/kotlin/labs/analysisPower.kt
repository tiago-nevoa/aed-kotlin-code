package labs

/**
 * Evaluate the time of the function.
 * 1. Print the identifier of the function;
 * 2. Foreach value in the array, call algorithmEvaluation to
 *    obtain the time of the function and print the value and
 *    the time of the evaluation.
 * print the value and the time of the function.
 * @param values the values to be evaluated in the function
 * @param identifier the identifier of the function
 * @param funPower the function to be evaluated
 */
fun evaluatePower(identifier:String, base : Int, exponent: Array<Int>, funPower: (base: Int, exponent: Int) -> Long) {
    println("----- $identifier -----")
    for ( e in exponent ) {
        print("$e ")
        val time = algorithmEvaluation() { funPower(base,e) }
        println("$time")
    }
}

fun main() {
//    evaluatePower("power recursive", getMultiples(4, 1920000), ::powerRecursive)
    evaluatePower("power recursive optimized", 2, getMultiples(4, 192000000), ::powerRecursiveOptimized)
    evaluatePower("power iterative", 2, getMultiples(4, 192000000),::powerIterativo)

}
