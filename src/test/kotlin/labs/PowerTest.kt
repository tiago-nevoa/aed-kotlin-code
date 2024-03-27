package labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowerTest {
    @Test
    fun testExpoent0Recursive() {
        assertEquals(1, powerRecursive( 2, 0))
    }
    @Test
    fun testEvenRecursive() {
        assertEquals(16, powerRecursive(2, 4))
    }
    @Test
    fun testOddRecursive() {
        assertEquals(32, powerRecursive( 2, 5))
    }
    @Test
    fun testExpoent0RecursiveOptimized() {
        assertEquals(1, powerRecursiveOptimized( 2, 0))
    }
    @Test
    fun testEvenRecursiveOptimized() {
        assertEquals(16, powerRecursiveOptimized(2, 4))
    }
    @Test
    fun testOddRecursiveOptimized() {
        assertEquals(32, powerRecursiveOptimized( 2, 5))
    }
    @Test
    fun testExpoent0Iterative() {
        assertEquals(1, powerIterativo( 2, 0))
    }
    @Test
    fun testEvenRecursiveIterative() {
        assertEquals(16, powerIterativo(2, 4))
    }
    @Test
    fun testOddRecursiveIterative() {
        assertEquals(32, powerIterativo( 2, 5))
    }
}
