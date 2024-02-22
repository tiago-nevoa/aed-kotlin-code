import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class MyFibonnaciTest {
    private val n = 50

    @Test
    fun recursivo() {
        val executionTime = measureTimeMillis {
            // Your code or function to be measured goes here
            print("fibonnnaci recursive n:$n = ")
            println(fibonnaciRecursive(n))
        }
        println("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun iterativo() {
        val executionTime = measureTimeMillis {
            // Your code or function to be measured goes here
            print("fibonnnaci iterativo n:$n = ")
            println(fibonnaciIterativo(n))
        }
        println("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun iterativoOtimizado() {
        val executionTime = measureTimeMillis {
            // Your code or function to be measured goes here
            print("fibonnnaci iterativo optimizado n:$n = ")
            println(fibonnaciIterativoOtimizado(n))
        }
        println("Execution Time: $executionTime milliseconds")
    }
}
