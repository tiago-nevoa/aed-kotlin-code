

fun main() {


    val n: Array<Long> = arrayOf(19_200_000,38_400_000,76_800_000,150_600_000)

    /*
        Testing fibonacci linear
     */
    n.forEach {
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("fibonacci linear $it: " + fibonacciLinear(it))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it)
    }
    /*
        Testing fibonacci constant
     */
    n.forEach {
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("fibonacci constante $it: " + fibonacciFinal(it))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it)
    }
}
