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

fun lowerBound(a: IntArray, left: Int, right: Int, elem: Int): Int {
    // toDo()
    return -1
}

fun upperBound(a: IntArray, left: Int, right: Int, elem: Int): Int {
    // toDo()
    return -1
}
