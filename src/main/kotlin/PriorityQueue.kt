// assume que implementaçao em min-heap

data class Utente(val name: String, val id: Int, val priority: Int)

data class PriorityQueue(val array : Array<Utente>, val cmp : (u1: Utente, u2: Utente) -> Int, var size : Int)

fun PriorityQueue.isEmpty() = size == 0

fun PriorityQueue.peek() : Utente? {
    return if(isEmpty()) null else array[0] // mais prioritario a cabeca da lista
}

fun PriorityQueue.offer(utente: Utente): Boolean {
    if (size == array.size) return false
    array[size++] = utente
    this.decreaseKey(size, size - 1, cmp)
    return true
}

fun PriorityQueue.poll(): Utente? {
    val utente = peek()

    if (utente != null) {
        array[0] = array[--size]
        minHeapify(0)
    }
    return utente
}

fun PriorityQueue.minHeapify(pos : Int) {
    var pai = pos
    val l = left(pos)
    val r = right (pos)
    if(l < size && cmp(array[l], array[pos]) < 0)
        pai = l
    if(l < size && cmp(array[l], array[pai]) > 0)
        pai = r
    if(pai != pos) {
        exchange(array,pai,pos)
        minHeapify(pai)
    }
}

fun PriorityQueue.decreaseKey(n: Int, pos: Int, cmp: (u1: Utente, u2: Utente) -> Int) {
    var pai = parent(pos)
    var actualPos = pos
    while (pai >= 0 && cmp(array[pai], array[pos]) > 0) {
        exchange(array, actualPos, pai)
        actualPos = pai
        pai = parent(pai)
    }
}

fun <T> exchange(a: Array<T>, i: Int, j: Int) {
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}
