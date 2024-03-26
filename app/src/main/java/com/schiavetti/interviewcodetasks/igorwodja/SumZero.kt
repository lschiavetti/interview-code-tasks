package com.schiavetti.interviewcodetasks.igorwodja

/**
 * Sum zero

 * Given sorted list of integers implement a function which finds the first pair where
 * the sum equals to 0. Return an pair that includes both values that sum to zero or
 * null if a pair does not exist.
 *
 * Examples
 * sumZero(listOf(1, 2)) // null
 *
 * sumZero(listOf(-3, -2, 0, 1, 2)) // Pair(-2, 2)
 *
 *
 * Source: https://github.com/igorwojda/kotlin-coding-challenges/tree/main/src/test/kotlin/com/igorwojda/list/sumzero
 */
object SumZero {

    fun getOutput(list: List<Int>): Pair<Int, Int>? {
        list.forEachIndexed { outerIndex, outerElement ->
            list.forEachIndexed { innerIndex, innerElement ->
                if (outerIndex != innerIndex) {
                    if (outerElement + innerElement == 0) return outerElement to innerElement
                }
            }
        }
        return null
    }
}
