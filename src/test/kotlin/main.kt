/**
 * Complexidade:
 *   em termos de tempo - O(n^2)
 *   em termos de espaço extra - O(n)
 */
fun fibonacciNaiveRecursiva(n : Int) : Int =
    if (n <= 1) n
    else fibonacciNaiveRecursiva (n - 1) + fibonacciNaiveRecursiva (n - 2)


fun main(){
    println(fibonacciNaiveRecursiva(200))
}
