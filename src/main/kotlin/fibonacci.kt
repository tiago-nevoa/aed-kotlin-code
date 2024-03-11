/*
    Em tempo complexidade   =   O(n^2)  :   exponencial
    Em espaco complexidade  =   O(n)    :   linear
 */

fun fibonacciRecursive(n: Int): Int {
    return if (n <= 1) 1
    else fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
}

/*
    Em tempo complexidade   =   O(n)    :   linear
    Em espaco complexidade  =   O(n)    :   linear
 */

fun fibonacciIterative(n: Int): Long {
    if (n <= 0) return 1
    val array = LongArray(n + 1)
    array[0] = 1
    array[1] = 1
    for (i in 2..n) {
        array[i] = array[i - 1] + array[i - 2]
    }
    return array[n]
}

/*
    Em tempo complexidade   =   O(n)    :   linear
    Em espaco complexidade  =   O(1)    :   constante
 */

fun fibonacciIterativeOptimized(n: Int): Long {
    if (n <= 1) return 1
    var f0 = 1L
    var f1 = 1L
    var result = 0L
    for (i in 2..n) {
        result = f0 + f1
        f0 = f1
        f1 = result
    }
    return result
}
