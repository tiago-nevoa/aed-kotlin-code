package list

class AEDArrayList<E> : AEDList<E> {

    private var elements: Array<E>

    constructor(array:Array<E>) {
        elements=array
    }

    override val size : Int
        get() = elements.size

    override fun get(i: Int): E {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }
}