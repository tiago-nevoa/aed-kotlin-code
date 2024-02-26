/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(n)  :   linear
 */

fun powerRecursive(a: Int, n: Int): Int{
    return if (n == 0) 1
    else a*powerRecursive(a,n-1)
}

/*
    Em tempo complexidade   =   O(log2^n)  :   logaritmica
    Em espaco complexidade  =   O(log2^n)  :   logaritmica
 */

fun powerRecursiveOptimized(a: Int, n: Int): Int{
    if (n == 0) return 1
    val z = powerRecursiveOptimized(a, n/2)
    return if (n%2 == 0) z*z
    else z*z*a
}