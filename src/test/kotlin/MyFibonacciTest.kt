import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.slf4j.LoggerFactory
import java.util.stream.Stream
import kotlin.system.measureTimeMillis

class MyFibonacciTest {
    private val logger = LoggerFactory.getLogger(MyFibonacciTest::class.java)

    companion object {
        @JvmStatic
        fun fibonacciTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(2),
                Arguments.of(4),
                Arguments.of(8),
                Arguments.of(16),
                Arguments.of(32)
                // Add more test cases as needed
            )
        }
    }

    @ParameterizedTest
    @MethodSource("fibonacciTestData")
    fun recursive(n: Int) {
        val executionTime = measureTimeMillis {
            logger.info("fibonacci recursive...")
            val fib = fibonacciRecursive(n)
            logger.info("fibonacci recursive n:$n = $fib")
            assertNotNull(fib)
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @ParameterizedTest
    @MethodSource("fibonacciTestData")
    fun iterative(n: Int) {
        val executionTime = measureTimeMillis {
            logger.info("fibonacci iterative...")
            val fib = fibonacciIterative(n)
            logger.info("fibonacci iterative n:$n = $fib")
            assertNotNull(fib)
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @ParameterizedTest
    @MethodSource("fibonacciTestData")
    fun optimizedIterative(n: Int) {
        val executionTime = measureTimeMillis {
            logger.info("fibonacci iterative optimized...")
            val fib = fibonacciIterativeOptimized(n)
            logger.info("fibonacci iterative optimized n:$n = $fib")
            assertNotNull(fib)
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }
}
