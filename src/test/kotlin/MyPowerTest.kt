import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import kotlin.system.measureTimeMillis

class MyPowerTest {
    private val logger = LoggerFactory.getLogger(MyFibonacciTest::class.java)
    private val base = 3
    private val exponente = 1024 * 1024

    @Test
    fun recursive() {
        val executionTime = measureTimeMillis {
            logger.info("power recursive...")
            val power = powerRecursive(base,exponente)
            logger.info("power recursive base: $base exponente:$exponente = $power")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun optimizedRecursive() {
        val executionTime = measureTimeMillis {
            logger.info("power recursive optimized...")
            val power = powerRecursiveOptimized(base,exponente)
            logger.info("power recursive optimized base: $base exponente:$exponente = $power")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun iterative() {
        val executionTime = measureTimeMillis {
            logger.info("power iterative...")
            val power = powerIterativo(base,exponente)
            logger.info("power iterative base: $base exponente:$exponente = $power")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }
}
