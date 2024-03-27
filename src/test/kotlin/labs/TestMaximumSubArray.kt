package labs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestMaximumSubArray {
    val maxSubArray:(Array<Double>, Int, Int)-> Triple<Int, Int, Double> = ::maximalSubArray
    val maxSubArrayKadane:(Array<Double>, Int, Int)-> Triple<Int, Int, Double> = ::maximalSubArrayKadane

    @Test
    fun testAllNegatives() {
        val a: Array<Double> = arrayOf(-2.0, -5.0, -1.0)
        val b = maxSubArray(a, 0, a.size-1)
        val c = maxSubArrayKadane(a, 0, a.size-1)
        assertEquals( Triple(2, 2, -1.0), b)
        assertEquals( b, c)
    }
    @Test
    fun testAllPositive() {
        val a: Array<Double> = arrayOf(2.0, 5.0, 1.0)
        val b = maxSubArray(a, 0, a.size - 1)
        val c = maxSubArrayKadane(a, 0, a.size-1)
        assertEquals(Triple(0, 2, 8.0), b)
        assertEquals(b, c)
    }
    @Test
    fun testMix() {
        val a: Array<Double> = arrayOf(2.0, -3.0, 5.0, -2.0, 3.0)
        val b = maxSubArray(a, 0, a.size - 1)
        val c = maxSubArrayKadane(a, 0, a.size-1)
        assertEquals(Triple(2, 4, 6.0), b)
        assertEquals(b, c)
    }
    @Test
    fun testEmpty() {
        var b = maxSubArray(arrayOf(), 0, -1)
        var c = maxSubArrayKadane(arrayOf(), 0, -1)
        assertTrue(b.first > b.second)
        assertEquals( Triple(0, -1, 0.0), b)
        assertTrue(c.first > c.second)
        assertEquals(b, c)

        b = maxSubArray(Array(5){0.0}, 3, 2)
        c = maxSubArrayKadane(Array(5){0.0}, 3, 2)

        assertTrue(b.first > b.second)
        assertTrue(c.first > c.second)
    }
}
