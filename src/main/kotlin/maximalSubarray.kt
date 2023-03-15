
fun maximumSubArrayQuad( array: Array<Int>, left: Int, right:Int ):Triple<Int,Int,Int> {
    if ( left > right )
        return Triple(left, right, 0)
    var res: Triple<Int, Int, Int> = Triple(left, left, array[left])
    for( l in left .. right) {
        var sum = 0
        for (r in l..right) {
            sum+= array[ r ]
            if( sum > res.third) res = Triple(l, r, sum)
        }
    }

    return res
}

fun maximumSubArrayLinear( array: Array<Int>, left: Int, right:Int ):Triple<Int,Int,Int> {
    if ( left > right ) {
        return Triple(left, right, 0)
    }
    var res: Triple<Int, Int, Int> = Triple(left, left, array[left])
    //for( l in left .. right) {
    var sum = 0
    var l = left
    for (r in left..right) {
        sum+= array[ r ]
        if( sum > res.third) res = Triple(l, r, sum)
        if (sum < 0) {
            sum = 0
            l = r + 1
        }
    }

    return res
}

fun main() {

    val dimQuad = 10000
    val dimLin = 2000000
    val dimArrayQuad: Array<Int> = arrayOf(dimQuad, dimQuad * 2, dimQuad * 4, dimQuad * 8, dimQuad * 16)
    val dimArrayLin: Array<Int> = arrayOf(dimLin, dimLin * 2, dimLin * 4, dimLin * 8, dimLin * 16)

    /*
        Testing maximalSubArray Quadratic O(nˆ2) --> Aleatory
     */
    dimArrayQuad.forEach {
        val array: Array<Int> = arrayPosNeg(it)
        //println(array.contentToString())
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("maxSubArrayQuad with Aleatory Int: " + maximumSubArrayQuad(array, 0, array.size - 1))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it + "dim")
    }
    /*
        Testing maximalSubArray Quadratic O(nˆ2) --> Negative
     */
    dimArrayQuad.forEach {
        val array: Array<Int> = arrayNeg(it)
        //println(array.contentToString())
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("maxSubArrayQuad with Neg Int: " + maximumSubArrayQuad(array, 0, array.size - 1))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it + "dim")
    }
    /*
        Testing maximalSubArray Quadratic O(nˆ2) --> Positive
     */
    dimArrayQuad.forEach {
        val array: Array<Int> = arrayPos(it)
        //println(array.contentToString())
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("maxSubArrayQuad with Pos Int: " + maximumSubArrayQuad(array, 0, array.size - 1))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it + "dim")
    }

    /*
        Testing maximalSubArray Linear O(n) --> Aleatory
     */
    dimArrayLin.forEach {
        val array: Array<Int> = arrayPosNeg(it)
        //println(array.contentToString())
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("maxSubArrayLin with Aleatory Int: " + maximumSubArrayLinear(array, 0, array.size - 1))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it + "dim")
    }
    /*
        Testing maximalSubArray Linear O(n) --> Negative
     */
    dimArrayLin.forEach {
        val array: Array<Int> = arrayNeg(it)
        //println(array.contentToString())
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("maxSubArrayLin with Neg Int: " + maximumSubArrayLinear(array, 0, array.size - 1))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it + "dim")
    }
    /*
        Testing maximalSubArray Linear O(n) --> Positive
     */
    dimArrayLin.forEach {
        val array: Array<Int> = arrayPos(it)
        //println(array.contentToString())
        val currentTimeMillis = System.currentTimeMillis()
        for (i in 0 until 5) {
            println("maxSubArrayLin with Pos Int: " + maximumSubArrayLinear(array, 0, array.size - 1))
        }
        println("run time: " + (System.currentTimeMillis() - currentTimeMillis) / 5 + " ms for " + it + "dim")
    }
}