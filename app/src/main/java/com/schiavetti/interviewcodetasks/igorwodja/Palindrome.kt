package com.schiavetti.interviewcodetasks.igorwodja

/**
 * Instructions
 * Given a string, return true if the string is a palindrome or false if it is not.
 * Palindromes are strings that form the same word if it is reversed.
 * Include spaces and punctuation in determining if the string is a
 * palindrome.
 *
 * Examples
 * palindrome("abba") // true
 *
 * palindrome("abcdefg") // false
 *
 *  source: https://github.com/igorwojda/kotlin-coding-challenges/tree/main/src/test/kotlin/com/igorwojda/string/ispalindrome/basic
 */
object Palindrome {

    fun isPalindrome(string: String) = string == string.reversed()

    fun isPalindromeAlternateVersion(input: String): Boolean {
        input.forEachIndexed { leftToRightIndex, char ->
            val rightToLeftIndex = input.lastIndex - leftToRightIndex

            if (leftToRightIndex < rightToLeftIndex) {
                if (char != input[rightToLeftIndex]) return false
            } else {
                return@forEachIndexed
            }
        }
        return true
    }
}
