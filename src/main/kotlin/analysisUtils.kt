import kotlin.random.Random

/**
 * Generate an array of random numbers
 * @param n the size of the array
 */
fun randomArray(n:Int):Array<Double> =
    Array(n) { Random.nextDouble(Double.MIN_VALUE,Double.MAX_VALUE) }

/**
 * Generate an array of negative numbers in decreasing order
 * @param n the size of the array
 */
fun negativeArrayDecreasing(n: Int): Array<Double> =
    Array<Double>(n){-it.toDouble()}

/**
 * Generate an array of positive numbers in increasing order
 * @param n the size of the array
 */
fun positiveArrayIncreasing(n: Int): Array<Double> =
    Array<Double>(n){it.toDouble()}

/**
 * Generate an array of multiples of 2
 * @param n the size of the array
 * @param initial the initial value
 */
fun getMultiples(n: Int, initial: Int): Array<Int> {
    val array = Array<Int>(n) {initial}
    for (i in 1 until array.size) {
        array[i] = array[i-1] * 2
    }
    return array
}

/**
 * Evaluate the time of an algorithm.
 * Use the System.currentTimeMillis() to get the initial time and the final time.
 * Evaluate the time of an algorithm by running it 13 times.
 * @param functionTest the function to be evaluated
 * @return the median time of the 11 values, removing the maximum and minimum values.
 */
fun algorithmEvaluation(functionTest: ()->Unit) :Int {
    val numberOfTrials = 11
    val executionTimes = Array<Long>(numberOfTrials){0}

    for (trial in 0 until numberOfTrials) {
        val startTime = System.currentTimeMillis()

        functionTest()

        val endTime = System.currentTimeMillis()
        val executionTime = endTime - startTime
        executionTimes[trial] = executionTime
    }
    val sortedExecutionTimes = executionTimes.sorted()

    // Calculate the median
    val median = if (sortedExecutionTimes.size % 2 == 1) {
        sortedExecutionTimes[sortedExecutionTimes.size / 2]
    } else {
        val mid = sortedExecutionTimes.size / 2
        (sortedExecutionTimes[mid - 1] + sortedExecutionTimes[mid]) / 2
    }

//    println("\nExecution times: $executionTimes")
//    println("Sorted Execution times: $sortedExecutionTimes")
//    println("Median execution time: $median milliseconds")
    return median.toInt()
}

