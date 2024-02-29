tailrec fun binarySearchRecursive(a: IntArray, left: Int, right: Int, element: Int): Int {
    if (right < left) return -1
    val mid = (left+right) / 2
    return  if (a[mid] == element) mid
    else
        if(a[mid]>element) binarySearchRecursive(a,left,mid-1,element)
        else binarySearchRecursive(a,mid+1,right,element)
}

fun binarySearchIterative(a: IntArray, left: Int, right: Int, elem: Int): Int {
    var l = left
    var r = right
    while(l <= r){
        val mid = (l+r)/2
        if(a[mid] == elem) return mid
        else {
            if(a[mid]<elem) l = mid + 1
            else r = mid -1
        }
    }
    return -1
}

fun insertionSort (a : IntArray, left : Int, right: Int) {
    var v = 0
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

fun exchange(a: IntArray, i: Int, j: Int) {
    val tmp = a[i]
    a[i] = a[j]
    a[j] = tmp
}
