package com.schiavetti.interviewcodetasks.codeacademy

/**
 *  A palindrome is a word or phrase that could be spelled the same forward and backward.
 *  Examples of palindromes include the words “level” and “racecar” as well as the phrase
 *  “taco cat.”
 *
 * Create a function that returns TRUE if an input string is a permutation of a palindrome
 * — that is, if the string could somehow be rearranged to make a palindrome. For example,
 * the strings “racecar,” “carrace,” and “gghhk” should return TRUE, while words such as
 * “tammy” and “code” should return FALSE.
 *
 * For an additional challenge, allow your input to include phrase strings.
 * You’ll need to find a way to remove all spaces in the input string before running your function.
 *
 *  Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 *
 *
 *  Notes:
 *  According to the task, the input won't be necessarily an actual word, it can also be
 *  a combination of letters. That being said, it's possible to tell if the word can
 *  be a palindrome or not only by counting its letters.
 *  If the total number of letters of a palindrome is even, then all its letters will come
 *  in even numbers (it cannot contain a letter appearing only once, for example).
 *  Now, if the total number of letters is an odd number, it's going to be a palindrome
 *  only if the number of letters with an odd occurrence doesn't surpass one.
 */
object PermutationPalindrome {

    fun isPermutedPalindrome(input: String): Boolean {
        val wordOrSentence = input
            .replace(" ", "")
            .lowercase()

        val oddOccurrenceChars = mutableListOf<Char>()

        wordOrSentence.forEach { char ->
            val hasEvenOccurrences = wordOrSentence.count {
                it == char
            } % 2 == 0

            if (hasEvenOccurrences.not()) oddOccurrenceChars.add(char)
        }
        return oddOccurrenceChars.distinct().size <= 1
    }
}
