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
 * @param funFibonacci the function to be evaluated
 */
fun evaluateFibonacci(identifier:String, values: Array<Int>, funFibonacci: (Int) -> Long) {
    println("----- $identifier -----")
    for ( v in values ) {
        print("$v ")
        val time = algorithmEvaluation() { funFibonacci(v) }
        println("$time")
    }
}

fun main() {
//    evaluateFibonacci("fibonacci recursive", getMultiples(4, 6), ::fibonacciRecursive)
    evaluateFibonacci("fibonacci iterative", getMultiples(4, 192000000/8), ::fibonacciIterative)
    evaluateFibonacci("fibonacci iterative optimized", getMultiples(4, 192000000/8),::fibonacciIterativeOptimized)
}
