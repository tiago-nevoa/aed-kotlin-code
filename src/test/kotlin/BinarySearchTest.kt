import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import binarySearch;
fun binarySearch(array: IntArray, l: Int, r: Int, element: Int): Int {
    println("Init search")
    var l = l
    var r = r
    var mid: Int
    while (l <= r) {
        mid = (l + r) / 2
        if (array[mid] == element)
            return mid
        else if (array[mid] < element)
            l = mid + 1
        else
            r = mid - 1
    }
    println("End search")
    return -1
}

class BinarySearchTest {

        @Test
        fun binarySearch_OnEmptyArray() {
            val a = IntArray(0)
            for (i in 0..2) {
                val res = binarySearch(a, 0, -1, 0)
                assertEquals(-1, res)
            }
        }

        @Test
        fun binarySearch_OnOneElementArray() {
            val a = IntArray(1)
            assertEquals(0, binarySearch(a, 0, 0, 0))
        }

        @Test
        fun binarySearch_allPresent() {
            val a = intArrayOf(1, 2, 3, 4, 5)
            for (d in 1 until a.size) {
                assertEquals(d - 1, binarySearch(a, 0, a.size - 1, d))
            }
        }

        @Test
        fun binarySearch_nonePresent() {
            val a = intArrayOf(2, 4, 6, 8, 10)
            for (d in 1 until a.size) {
                assertEquals(-1, binarySearch(a, 0, a.size - 1, 2 * d + 1))
            }

    }
}