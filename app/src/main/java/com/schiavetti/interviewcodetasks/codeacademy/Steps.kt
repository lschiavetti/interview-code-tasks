package com.schiavetti.interviewcodetasks.codeacademy

/**
 *  For a given integer input n, create a function that returns a string output of generated steps
 *  using the # character. For example, for an input of 3, the output should look like:
 *
 * ‘# ‘
 *
 * ‘##’
 *
 * ‘###’
 *
 * If you’d like to “step up” this challenge, add a string input that allows the function to
 * generate steps for any given single character.
 *
 * Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 */
object Steps {

    fun generateSteps(max: Int): String {
        return StringBuilder().run {
            (1..max).forEach {
                repeat(it) { append("#") }
                appendLine()
            }
            toString()
        }
    }
}
