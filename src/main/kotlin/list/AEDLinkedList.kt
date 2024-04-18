package list

class AEDLinkedList<E>: AEDMutableList<E> {

    private class Node<E> {
        var item : E?
        var previous : Node<E>
        var next : Node<E>

        constructor(element: E?){
            item = element
            next = this
            previous = this
        }

    }

    override fun add(pos: Int, element: E): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(pos: Int): Boolean {
        TODO("Not yet implemented")
    }

    override var size = 0
    override fun get(i: Int): E {
        var current= head.next
        var count=0
        while (current!=head && count<i){
            current=current.next
            count++
        }
        if (count==i && current!=head) return current.item!!
        throw IndexOutOfBoundsException()
    }

    private var head = Node<E>(null)

    override fun add(element: E): Boolean {
        val new = Node(element)
        new.next=head
        new.previous=head.previous
        head.previous.next=new
        size++
        return true
    }

    private fun search (element : E) : Node<E>?{
        var current = head.next
        while (current!=head){
            if (current.item==element) return current
            current=current.next
        }
        return null
    }

    override fun remove(element: E): Boolean {
        val toRemove=search(element)
        if(toRemove == null) return false
        toRemove.previous.next = toRemove.next
        toRemove.next.previous = toRemove.previous
        size--
        return true
    }

    override fun isEmpty(): Boolean {
        return head==head.previous && head==head.next
    }

    override fun contains(element: E): Boolean {
        TODO("Not yet implemented")
    }
}
