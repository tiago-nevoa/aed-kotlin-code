package list

fun main() {
    val ar=Array<Int>(5,{i->i})
    val list=AEDArrayListImmutable<Int>(ar)
    println(list.size)
    println(list.get(0))
    val ar1=Array<String>(5,{i->"string $i"})
    val list1=AEDArrayListImmutable<String>(ar1)
    println(list1.size)
    println(list1.get(0))
    println(list1[0])
    val list3=AEDArrayList<Int>()
}
