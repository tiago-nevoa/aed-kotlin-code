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
