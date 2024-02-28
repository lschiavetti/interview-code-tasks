package com.schiavetti.interviewcodetasks.codeacademy

/**
 * 1. Number steps
 * Many programming languages have built-in functions that output sequences of numbers
 * separated by steps. Create your own Kotlin function from scratch that creates a sequenced
 * list of numbers from 0 to a maximum input value and input step. For example, a maximum
 * value of 8 and a step value of 2 should return an output of [2, 4, 6, 8].
 *
 * Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 *
 * Even though it's not commonly used on daily tasks, the step function is interesting.
 * It allows to perform a loop with a defined pace, different from using a default loop
 * which will always take 1 as the step value, and thus perform the loop through all the
 * elements and numbers on the list.
 *
 */
object NumberSteps {

    fun generateListOfNumbers(max: Int, pace: Int): List<Int> {
        val list = mutableListOf<Int>()

        for (i in 0..max step pace) {
            list.add(i)
        }
        return list
    }

    /**
     *   If you’re looking for more of a challenge, create a Fibonacci sequence generator.
     *   Remember that the following number of a Fibonacci sequence is the sum of the
     *   two preceding it: [1, 1, 2, 3, 5, 8, 13].
     *
     */
    fun generateFibonacciSequence(max: Int): List<Int> {

        val fibonacciNumbers = mutableListOf(1, 1)

        with(fibonacciNumbers) {
            while (size != max) {
                add(this[lastIndex - 1] + last())
            }
        }
        return fibonacciNumbers
    }
}
