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
fun evaluateMaximalSubarray(identifier:String, values: Array<Int>, funMaximalSubarray: (Array<Double>) -> Triple<Int,Int,Double>, funArrayGenerator: (Int) -> Array<Double>) {
    println("----- $identifier -----")
    for ( v in values ) {
        print("$v ")
        val array = funArrayGenerator(v)
        val time = algorithmEvaluation() { funMaximalSubarray(array) }
        println("$time")
    }
}

fun main() {
    evaluateMaximalSubarray("maximal subarray (random)", getMultiples(5, 10000), ::maximalSubArray, ::randomArray)
    evaluateMaximalSubarray("maximal subarray (negative decreasing)", getMultiples(5, 10000), ::maximalSubArray, ::negativeArrayDecreasing)
    evaluateMaximalSubarray("maximal subarray (positive increasing)", getMultiples(5, 10000), ::maximalSubArray, ::positiveArrayIncreasing)
    evaluateMaximalSubarray("maximal subarray kadane (random)", getMultiples(5, 2000000),::maximalSubArrayKadane, ::randomArray)
    evaluateMaximalSubarray("maximal subarray kadane (negative decreasing)", getMultiples(5, 2000000),::maximalSubArrayKadane, ::negativeArrayDecreasing)
    evaluateMaximalSubarray("maximal subarray kadane (positive increasing)", getMultiples(5, 2000000),::maximalSubArrayKadane, ::positiveArrayIncreasing)
}
