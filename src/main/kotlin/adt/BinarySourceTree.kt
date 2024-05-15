package adt

class BinarySourceTree {

    data class Node<E>(var item: E, var left: Node<E>?, var right: Node<E>?)

    fun <E> contains(root: Node<E>?, element: E): Boolean {
        if (root == null) return false
        else if (root.item == element) return true
        else return contains(root.left, element) || contains(root.right, element)
    }

    // Assumindo que e uma BST
    fun <E> containsBST(root: Node<E>?, element: E, cmp: Comparator<E>): Boolean {
        if (root == null) return false
        else {
            val c = cmp.compare(root.item, element)
            return if (c == 0) true
            else {
                if (c < 0) contains(root.right, element, cmp)
                else contains(root.left, element, cmp)
            }
        }
    }

    fun <E> contains(root: Node<E>?, element: E, cmp: Comparator<E>): Boolean {
        var it = root
        while (it != null) {
            val  c = cmp.compare(it.item,element)
            if (c==0) return true
            else {
                if (c<0) it = it.right
                else it = it.left
            }
        }
        return false
    }
}
