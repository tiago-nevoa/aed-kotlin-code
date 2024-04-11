package list

fun main() {
    val ar =Array<Int>(5,{i->i})
    val list = AEDArrayList<Int>(ar)
    println(list.size)
    println(list.get(0))

}