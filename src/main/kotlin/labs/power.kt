package labs

/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(n)  :   linear
 */

fun powerRecursive(base: Int, exponent: Int): Long {
    return if (exponent == 0) 1
    else base*powerRecursive(base,exponent-1)
}

/*
    Em tempo complexidade   =   O(log2^n)  :   logaritmica
    Em espaco complexidade  =   O(log2^n)  :   logaritmica
 */

fun powerRecursiveOptimized(base: Int, exponent: Int): Long {
    if (exponent == 0) return 1
    val z = powerRecursiveOptimized(base, exponent/2)
    return if (exponent%2 == 0) z*z
    else z*z*base
}

/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(1)  :   constante
 */

fun powerIterativo(base: Int, exponent: Int): Long {
    var res = 1L
    for (e in 1 .. exponent){
        res *= base
    }
    return res
}
