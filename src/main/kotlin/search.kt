fun binarySearch(a: IntArray, l: Int, r: Int, el: Int): Int {
    if (r < l) return -1
    val mid = (l+r) / 2
    return  if (a[mid] == el) mid
    else
        if(a[mid]>el) binarySearch(a,l,mid-1,el)
        else binarySearch(a,mid+1,r,el)
}
