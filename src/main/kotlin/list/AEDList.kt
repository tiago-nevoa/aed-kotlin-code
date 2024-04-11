package list

interface AEDList<E> {

    val size : Int

    fun get(i:Int) : E

    fun isEmpty() : Boolean

}