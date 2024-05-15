package list

class AEDLinkedList2<E> : AEDMutableList<E> {

    private class Node<E> {
        var item : E?
        var next: Node<E>? = null

        constructor(element: E?) {
            item = element
        }
    }

    private var head = Node<E>(null)

    fun addFirst(element: E) : Boolean {
        val new = Node(element)
        new.next=head
        head=new
        size++
        return true
    }
    override fun add(element: E): Boolean {
        val new = Node(element)
        var current = head
        var previous: Node<E>? = null
        while(current!=null){
            previous=current
            current=current.next
        }
        if (previous==null){
            head=null
        }
        else {
            previous.next = new
        }
        size++
        return true
    }

    private fun search (element : E) : Node<E>?{
        var current = head
        while (current!=null){
            if (current.item==element) return current
            current=current.next
        }
        return null
    }

    override fun add(pos: Int, element: E): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(pos: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(element: E): Boolean {
        var current = head
        var previous: Node<E>? = null
        while (current != null) {
            if (current.item == element) break
            previous = current
            current = current.next
        }
        if (previous == null) {
            if (head == null) return false
            else {
                head = head.let { it?.next }
                size--
                return true
            }
        } else {
            if (current==null) return false
            else{
                previous.next=current
                size--
                return true
            }
        }
    }

    override var size = 0
    override fun get(i: Int): E {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: E) = search(element) != null
}