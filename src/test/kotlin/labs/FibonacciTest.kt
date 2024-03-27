package labs

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test
class FibonacciTest {
    @Test
    fun testFirstsRecursive(){
        assertEquals(1, fibonacciRecursive(0))
        assertEquals(1, fibonacciRecursive(1))
        assertEquals(2, fibonacciRecursive(2))
    }
    @Test
    fun testSmallValuesRecursive(){
        assertEquals( 377, fibonacciRecursive(13))
        assertEquals( 4181, fibonacciRecursive(18))
    }

    @Test
    fun testFirstsIterative(){
        assertEquals(1, fibonacciIterative(0))
        assertEquals(1, fibonacciIterative(1))
        assertEquals(2, fibonacciIterative(2))
    }
    @Test
    fun testSmallValuesIterative(){
        assertEquals( 377, fibonacciIterative(13))
        assertEquals( 4181, fibonacciIterative(18))
    }

    @Test
    fun testFirstsIterativeOptimized(){
        assertEquals(1, fibonacciIterativeOptimized(0))
        assertEquals(1, fibonacciIterativeOptimized(1))
        assertEquals(2, fibonacciIterativeOptimized(2))
    }
    @Test
    fun testSmallValuesIterativeOptimized(){
        assertEquals( 377, fibonacciIterativeOptimized(13))
        assertEquals( 4181, fibonacciIterativeOptimized(18))
    }
}
