import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.slf4j.LoggerFactory
import java.util.stream.Stream
import kotlin.system.measureTimeMillis

class MyPowerTest {
    private val logger = LoggerFactory.getLogger(MyFibonacciTest::class.java)

    companion object {
        @JvmStatic
        fun powerTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(2, 1024),
                Arguments.of(3, 1024*1024),
                Arguments.of(5, 1024*1024*1024)
                // Add more test cases as needed
            )
        }
    }

    @ParameterizedTest
    @MethodSource("powerTestData")
    fun recursive(base: Int, exponente: Int) {
        val executionTime = measureTimeMillis {
            logger.info("power recursive...")
            val power = powerRecursive(base, exponente)
            logger.info("power recursive base: $base exponente: $exponente = $power")
            assertNotNull(power)
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @ParameterizedTest
    @MethodSource("powerTestData")
    fun optimizedRecursive(base: Int, exponente: Int) {
        val executionTime = measureTimeMillis {
            logger.info("power recursive optimized...")
            val power = powerRecursiveOptimized(base, exponente)
            logger.info("power recursive optimized base: $base exponente: $exponente = $power")
            assertNotNull(power)
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @ParameterizedTest
    @MethodSource("powerTestData")
    fun iterative(base: Int, exponente: Int) {
        val executionTime = measureTimeMillis {
            logger.info("power iterative...")
            val power = powerIterativo(base, exponente)
            logger.info("power iterative base: $base exponente: $exponente = $power")
            assertNotNull(power)
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }
}
