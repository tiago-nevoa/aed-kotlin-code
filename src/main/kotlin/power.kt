/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(n)  :   linear
 */

fun powerRecursive(base: Int, exponente: Int): Int{
    return if (exponente == 0) 1
    else base*powerRecursive(base,exponente-1)
}

/*
    Em tempo complexidade   =   O(log2^n)  :   logaritmica
    Em espaco complexidade  =   O(log2^n)  :   logaritmica
 */

fun powerRecursiveOptimized(base: Int, exponente: Int): Int{
    if (exponente == 0) return 1
    val z = powerRecursiveOptimized(base, exponente/2)
    return if (exponente%2 == 0) z*z
    else z*z*base
}

/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(1)  :   constante
 */

fun powerIterativo(base: Int, exponente: Int): Int {
    var res = 1
    for (e in 1 .. exponente){
        res *= base
    }
    return res
}
