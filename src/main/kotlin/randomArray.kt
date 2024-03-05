import kotlin.random.Random

fun randomArray(size: Int): IntArray {
    // Create an IntArray of size n
    val array = IntArray(size)

    // Fill the array with random values
    for (i in 0 until size) {
        array[i] = Random.nextInt()
    }

    return array
}

fun randomArraySort(size: Int): IntArray {
    val array = randomArray(size)
    array.sort()
    return array
}