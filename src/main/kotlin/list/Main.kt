package list

fun main() {
    val ar =Array<Int>(5,{i->i})
    val list = AEDArrayList<Int>(ar)
    println(list.size)
    println(list.get(0))
    val ar1=Array<String>(5,{i->"stinng $i"})
    val list1 = AEDArrayList<String>(ar1)
    println(list1.size)
    println(list1.get(0))
    println(list1[0])
}
