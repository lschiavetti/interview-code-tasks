package com.schiavetti.interviewcodetasks.igorwodja

/**
 * Implement a stack data structure. Adding to the stack should store an element
 * until it is removed. First element added to a stack will be the last that is
 * removed (FILO).
 *
 * The stack should be a class with members:
 *
 * - add method - adds element to the stack
 * - remove method - removes the "top" element from the stack
 * - peek method - returns "top" element (the one that should be returned) without removing (removeping) it from the stack
 * - isEmpty() - returns true if there are elements on the stack, otherwise return false
 * - size - numbers of items in the stack
 *
 * The stack can be implemented in few different ways by using different underlying data
 * structures. Implement each of them:
 *
 * List
 * Linked list
 *
 * Examples
 * val s = new Stack()
 * s.add(1)
 * s.add(2)
 * s.remove() // 2
 * s.remove() // 1
 * s.remove() // null
 *
 *
 *  Source: https://github.com/igorwojda/kotlin-coding-challenges/blob/main/src/test/kotlin/com/igorwojda/stack/basic/README.md
 *
 *  Note: According to the author of this challenge, it's not ideal to solve by adding the
 *  elements to the beginning of the list, since all remaining elements have to be indexed
 *  after that (due to performance)
 *
 */
class Stack<T> {

    private val list = mutableListOf<T>()

    fun add(element: T) {
        list.add(0, element)
    }

    fun remove() {
        list.removeAt(0)
    }

    fun peek() = list[0]

    fun isEmpty() = list.isEmpty()

    fun getSize() = list.size
}
