import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import kotlin.system.measureTimeMillis

class MyPowerTest {
    private val logger = LoggerFactory.getLogger(MyFibonacciTest::class.java)
    private val a = 2
    private val n = 31

    @Test
    fun recursive() {
        val executionTime = measureTimeMillis {
            logger.info("power recursive...")
            val power = powerRecursive(a,n)
            logger.info("power recursive a: $a n:$n = $power")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }

    @Test
    fun optimizedRecursive() {
        val executionTime = measureTimeMillis {
            logger.info("power recursive optimized...")
            val power = powerRecursiveOptimized(a,n)
            logger.info("power recursive optimized a: $a n:$n = $power")
        }
        logger.info("Execution Time: $executionTime milliseconds")
    }
}