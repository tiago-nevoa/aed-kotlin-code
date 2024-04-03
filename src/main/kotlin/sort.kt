fun insertionSort (a : IntArray, left : Int, right: Int) {
    var v : Int
    for( i in left + 1 .. right){
        v = a[i]
        var j = i
        while (j > left && v < a[j-1]) {
            a[j] = a[j-1]
            j--
        }
        a[j] = v
    }
}

fun selectionSort(a : IntArray, left : Int, right: Int) {
    for (i in left until right) {
        var min = i
        for(j in i + 1 .. right) {
            if (a[min] > a[j]) min = j
        }
        exchange(a,min,i)
    }
}

/*
    Em tempo complexidade   =   O(1)  :   linear
    Em espaco complexidade  =   O(1)  :   constante
 */

fun exchange(a: IntArray, i: Int, j: Int) {
    val tmp = a[i]
    a[i] = a[j]
    a[j] = tmp
}

/*
    Em tempo complexidade   =   O(n^2)  :   exponencial
    Em espaco complexidade  =   O(n)    :   linear
 */

fun bubbleSort(a : IntArray, left : Int, right: Int) {
    for(i in left until right) {
        for (j in right downTo i+1) {
            if (a[j] < a[j-1])
                exchange(a,i,j)
        }
    }
}

fun mergeSort(a: IntArray, left: Int, right: Int) {
    if (left < right) {
        val middle = (left + right) / 2

        // Sort first and second halves
        mergeSort(a, left, middle)
        mergeSort(a, middle + 1, right)

        // Merge the sorted halves
        merge(a, left, middle, right)
    }
}

fun merge(arr: IntArray, left: Int, middle: Int, right: Int) {
    val n1 = middle - left + 1
    val n2 = right - middle

    // Create temporary arrays
    val leftArray = IntArray(n1)
    val rightArray = IntArray(n2)

    // Copy data to temporary arrays leftArray[] and rightArray[]
    for (i in 0 until n1) {
        leftArray[i] = arr[left + i]
    }
    for (j in 0 until n2) {
        rightArray[j] = arr[middle + 1 + j]
    }

    // Merge the temporary arrays

    // Initial indexes of first and second sub-arrays
    var i = 0
    var j = 0

    // Initial index of merged sub-array
    var k = left

    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k] = leftArray[i]
            i++
        } else {
            arr[k] = rightArray[j]
            j++
        }
        k++
    }

    // Copy remaining elements of leftArray[], if there are any
    while (i < n1) {
        arr[k] = leftArray[i]
        i++
        k++
    }

    // Copy remaining elements of rightArray[], if there are any
    while (j < n2) {
        arr[k] = rightArray[j]
        j++
        k++
    }
}



/*
    Em tempo complexidade   =
    Em espaco complexidade  =
 */

fun mergeSortClass (a : IntArray, left : Int, right : Int) {
    if (left < right) {
        val mid = (left + right) ushr 1
        mergeSortClass(a, left, mid)
        mergeSortClass(a, mid + 1, right)
        mergeClass(a, left, mid, right)
    }
}

/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(n)  :   linear
 */

fun mergeClass (a : IntArray, left: Int, middle: Int, right: Int) {
    val b = IntArray(middle - left + 1)
    val c = IntArray(right - middle)
    for (i in b.indices) {
        b[i] = a[i + left]
    }
    for (i in c.indices) {
        c[i] = a[i + middle+1]
    }
    mergeClass(a,left,right,b,c)
}

/*
    Em tempo complexidade   =   O(n)  :   linear
    Em espaco complexidade  =   O(n)  :   linear
 */

fun mergeClass (a : IntArray, left : Int, right : Int, b : IntArray, c : IntArray) {
    var iB = 0
    var iC = 0
    var iA = left
    while (iB < b.size && iC < c.size) {
        if (b[iB] <= c[iC])
            a[iA++] = b[iB++]
        else
            a[iA++] = c[iC++]
    }
    while (iB < b.size)
        a[iA++] = b[iB++]
    while (iC < c.size)
        a[iA++] = c[iC++]
}

fun partition(array : Array<Int>, left : Int, right : Int) : Int{
    var i = left-1
    var j = right
    val pivot = array[right]

    while (true) {
        while(i < right && array[++i] < pivot);
        while(j > left && array[--j] > pivot);

        if (i >= j) break

        exchange(array,i,j)
    }
    exchange(array,i,right)
    return i
}

fun quickSort(array: Array<Int>, left : Int, right : Int) {
    val i = partition(array, left, right)
    if (left < right) {
        quickSort(array, left, i - 1)
        quickSort(array, i + 1, right)
    }
}
