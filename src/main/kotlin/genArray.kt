import kotlin.random.Random

/* Gerar um array de dim Int positivos e negativos.
 * Usa o método Ramdom.nextInt( min, max).
 * O valor do min e do max  podem ser positivos ou negativos.
*/
fun arrayPosNeg (dim: Int): Array<Int> {
    val array: Array<Int> = Array (dim) {0}
    val random = Random(System.currentTimeMillis())
    for (i in array.indices) {
        array[i] = random.nextInt()
    }
    return array
}

/* Gerar um array de dim Int de valores positivos */
fun arrayPos (dim: Int): Array<Int> {
    val array: Array<Int> = Array (dim) {0}
    val random = Random(System.currentTimeMillis())
    for (i in array.indices) {
        array[i] = random.nextInt(0, Int.MAX_VALUE)
    }
    return array
}

/* Gerar um array de dim Int de valores negativos */
fun arrayNeg (dim: Int): Array<Int> {
    val array: Array<Int> = Array (dim) {0}
    val random = Random(System.currentTimeMillis())
    for (i in array.indices) {
        array[i] = random.nextInt(Int.MIN_VALUE,0)
    }
    return array
}

