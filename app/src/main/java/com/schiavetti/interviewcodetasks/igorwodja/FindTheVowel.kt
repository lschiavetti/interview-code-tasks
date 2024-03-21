package com.schiavetti.interviewcodetasks.igorwodja

/**
 *  Find the vowels
 * Instructions
 * Given string implement a function, which returns the number of vowels used in a string. Vowels are the characters a , e i, o, u and y.
 *
 * Examples
 * vowels('Hi There!') // 3
 *
 * vowels('Why do you ask?') // 6
 *
 * vowels('Why?') // 1
 *
 *  Source: https://github.com/igorwojda/kotlin-coding-challenges/tree/main/src/test/kotlin/com/igorwojda/string/vowels
 */
object FindTheVowel {

    fun getVowelCount(input: String): Int {
        val vowelRegexPattern = "[aeiouy]"

        return Regex(vowelRegexPattern).findAll(input).count()
    }

    fun getVowelCountAlternateVersion(input: String): Int {
        return input.count {
            "$it" == "a" ||
                    "$it" == "e" ||
                    "$it" == "i" ||
                    "$it" == "o" ||
                    "$it" == "u" ||
                    "$it" == "y"
        }
    }
}
