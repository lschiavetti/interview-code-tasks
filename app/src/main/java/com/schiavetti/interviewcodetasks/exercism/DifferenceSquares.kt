package com.schiavetti.interviewcodetasks.exercism

/**
 * Instructions
 * Find the difference between the square of the sum and the sum of the squares of the
 * first N natural numbers.
 *
 * The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.
 *
 * The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.
 *
 * Hence the difference between the square of the sum of the first ten natural numbers
 * and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.
 *
 * You are not expected to discover an efficient solution to this yourself from first
 * principles; research is allowed, indeed, encouraged. Finding the best algorithm for
 * the problem is a key skill in software engineering.
 *
 *  Source: https://exercism.org/tracks/kotlin/exercises/difference-of-squares
 */
object DifferenceSquares {

    fun getDifferenceCalculation(limitNumber: Int): Int {

        val totalSum = (1..limitNumber).sum()
        val squareOfSum = totalSum * totalSum

        val sumOfSquares = (1..limitNumber).sumOf {
            it * it
        }

        return squareOfSum - sumOfSquares
    }
}
