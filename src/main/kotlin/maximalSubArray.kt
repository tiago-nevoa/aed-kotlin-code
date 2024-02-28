fun maximalSubArray(a: IntArray, l: Int, r: Int): Triple{
    var bestLeft = l
    var bestRight = l-1
    var bestSum = 0
    var actualSum = 0

    for (i in l .. r) {
        actualSum = 0
        for(j in i .. r) {
            actualSum += a[j]
            if (actualSum >= bestSum) {
                bestLeft = i
                bestRight = j
                bestSum = actualSum
            }
        }
    }
    return Triple(bestSum,bestLeft,bestRight)
}