package com.schiavetti.interviewcodetasks.kotlin

object FoldStudy {

    /**
     *   Even though this first example is a very useless one for the
     *   usage of fold, it shows what the function is capable of.
     *   It basically iterates through an object (usually a list), returning
     *   an accumulator on every loop.
     *
     *   For the usage, there are two types that should be considered:
     *   T, which corresponds to the type of the element on the list.
     *   And K, which will be the accumulator and return type for the
     *   operator and also for the function itself.
     *
     *   The example below iterates through a list and returns a different
     *   instance of the list containing the same elements.
     */
    fun foldStudy() {
        val names = listOf("Freud", "Rubia", "Dunker", "Monica")

        val sameNamesInDifferentList = names.fold(mutableListOf<String>()) { list, name ->
            list.apply { add(name) }
        }

        println("Kfk: List is $sameNamesInDifferentList")
    }

    /**
     *   Fold Right works just like the normal fold, but starting the iteration
     *   from the end of the list, that is, right. Note that the order of the
     *   parameters are inverted: it's i, acc instead of acc, i
     */
    fun foldRightStudy() {
        val numbers = listOf(1, 2, 3, 4)

        val resultList = numbers.foldRight(mutableListOf<Int>()) { i, acc ->
            acc.apply { add(i) }
        }
        println("Kfk: List of Numbers is $resultList")
    }

    /**
     *  RunningFold works just like the standard fold function.
     *  The only difference I could notice is that runningFold
     *  returns a list with intermediate results of the accumulator in a List of R, whereas
     *  the fold returns only final accumulator R.
     */
    fun runningFoldStudy() {
        val numbers = listOf(2, 3, 4, 5)

        val result = numbers.fold(1) { acc, number ->
            acc + number
        }
        println("Kfk: The fold result is $result")

        val resultList = numbers.runningFold(1) { acc, number ->
            acc + number
        }
        println("Kfk: The runningFold result is $resultList")
    }
}
