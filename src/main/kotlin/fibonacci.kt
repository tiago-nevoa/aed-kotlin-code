/**
 *  Sequência de Fibonacci:
 *   f(0) = 0
 *   f(1) = 1
 *   f( n ) = (f(n-1) + f(n -2) para n > 1
 * Complexidade:
 *   em termos de tempo - O(2^n)
 *   em termos de espaço extra - O(n)
 */
fun fibonacciLinear(n:Long): Long{
    if (n <= 1) return n
    val array = Array(n.toInt() + 1) {0L}
    array[1] = 1
    for (i in 2 .. n.toInt()) {
        array[i] = array[i - 1] + array[i - 2]
    }
    val runtime = Runtime.getRuntime()
    val totalMemory = runtime.totalMemory() // total memory allocated by JVM
    val freeMemory = runtime.freeMemory() // free memory available in JVM
    val usedMemory = totalMemory - freeMemory // used memory by JVM

    println("Total Memory: ${totalMemory / (1024 * 1024)} MB")
    println("Free Memory: ${freeMemory / (1024 * 1024)} MB")
    println("Used Memory: ${usedMemory / (1024 * 1024)} MB")
    return array[n.toInt()]
}

/**
 * Complexidade:
 *   em termos de tempo - O(n)
 *   em termos de espaço extra - O(1)
 */
fun fibonacciFinal(n:Long ): Long {

    if ( n <= 1 )  return n
    val array = arrayOf(0L, 1L)
    for( i in 2 .. n ) {
        val aux = array[0] + array[1]
        array[0] = array[1]
        array[1] = aux
    }
    val runtime = Runtime.getRuntime()
    val totalMemory = runtime.totalMemory() // total memory allocated by JVM
    val freeMemory = runtime.freeMemory() // free memory available in JVM
    val usedMemory = totalMemory - freeMemory // used memory by JVM

    println("Total Memory: ${totalMemory / (1024 * 1024)} MB")
    println("Free Memory: ${freeMemory / (1024 * 1024)} MB")
    println("Used Memory: ${usedMemory / (1024 * 1024)} MB")
    return array[1]
}