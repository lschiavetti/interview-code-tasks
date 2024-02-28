package com.schiavetti.interviewcodetasks.codeacademy

/**
 * For a given input string of words, create a function that returns
 * the longest word in the string. For example, for the input phrase
 * “I love Codecademy,” the output should be “Codecademy.”
 *
 * For an added challenge, you can create an output that lists the
 * longest word along with the number of characters in the word.
 * So, for the string “I love Codecademy,” the output would look
 * something like, “word: Codecademy count: 10.”
 *
 *  Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 */
object LongestWord {

    fun getLongestWord(sentence: String): String {

        val words = sentence.split(" ")

        return words.maxBy { it.length }
    }
}
