
// 1 step

fun maxHeapify(array : Array <Int>, n : Int, pos : Int) {
    val l = left(pos)
    val r = right(pos)
    var pai = pos
    if (l < n && array[l] > array[pai])
        pai = l
    if (r < n && array[r] > array[pai])
        pai = l
    if(pai != pos) {
        exchange(array, pai, pos)
        maxHeapify(array, n, pai)
    }
}

fun exchange(a: Array <Int>, i: Int, j: Int) {
    val tmp = a[i]
    a[i] = a[j]
    a[j] = tmp
}

fun left (i : Int) = 2 * i + 1

fun right (i : Int) = 2 * i + 2

fun parent (i : Int) = (i - 1) / 2

// 2 step
// O(n*log2^n)
fun transform(array: Array<Int>, n : Int) {
    var size = n

    while(size > 0) {
        exchange(array, 0, --size)
        maxHeapify(array, size, 0)
    }
}

fun buildMaxHeap(array : Array <Int>, n : Int) {
    var pai = parent(n-1)
    while (pai >= 0) {
        maxHeapify(array, n, pai)
        pai--
    }
}

fun increaseKey(array: Array<Int>, n : Int, pos : Int) {
    var pai = parent(pos)
    var actualPos = pos
    while (actualPos > 0 && array[actualPos] > array[pai]) {
        exchange(array,actualPos,pos)
        actualPos = pai
        pai = parent(actualPos)
    }
}

//O(n*log2^n)

fun heapSort(array: Array<Int>, n: Int){
    buildMaxHeap(array, n)
    transform(array, n)
}
