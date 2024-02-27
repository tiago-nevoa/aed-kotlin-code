import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import kotlin.system.measureTimeMillis

class MyFibonacciTest {
    private val logger = LoggerFactory.getLogger(MyFibonacciTest::class.java)
    private val n = 64

    @Test
    fun recursive() {
        val executionTime = measureTimeMillis {
            logger.info("fibonacci recursive...")
            val fib = fibonacciRecursive(n)
            logger.info("fibonacci recursive n:$n = $fib")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun iterative() {
        val executionTime = measureTimeMillis {
            logger.info("fibonacci iterative...")
            val fib = fibonacciIterative(n)
            logger.info("fibonacci iterative n:$n = $fib")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun optimizedIterative() {
        val executionTime = measureTimeMillis {
            logger.info("fibonacci iterative optimized...")
            val fib = fibonacciIterativeOptimized(n)
            logger.info("fibonacci iterative optimized n:$n = $fib")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }
}