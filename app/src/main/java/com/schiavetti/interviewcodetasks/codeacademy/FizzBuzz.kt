package com.schiavetti.interviewcodetasks.codeacademy

/**
 *  The FizzBuzz challenge is a popular problem in technical interviews. For a given maximum input
 *  value n, create a function that outputs integers from 1 to n.
 *
 * But, if an integer is divisible by three, then the number should be replaced with the word
 * “Fizz.” Numbers divisible by five should say “Buzz” instead. And numbers divisible by both
 * three and five should say “FizzBuzz.”
 *
 * For example, with an input of 17, the output should be:
 *
 * [1, 2 , ”Fizz”, 4, “Buzz”, “Fizz”, 7, 8, “Fizz“, “Buzz“, 11, “Fizz”, 13, 14, “FizzBuzz”, 16, 17]
 *
 * Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 */
object FizzBuzz {

    fun generateNumbers(max: Int): String {

        val numbers = mutableListOf<String>()

        for (i in 1..max) {
            when {
                i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> "$i"
            }.also {
                numbers.add(it)
            }
        }

        return numbers.joinToString()
    }
}
