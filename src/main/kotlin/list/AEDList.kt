package list

interface AEDList<E> {

    val size : Int

    operator fun get(i:Int) : E

    fun isEmpty() : Boolean

    fun contains(element:E):Boolean

}