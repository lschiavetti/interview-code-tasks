package com.schiavetti.interviewcodetasks.igorwodja

/**
 *
 *  Given two strings implement a function which determines whether the characters
 *  in the second string is a substring of the characters in the first string (check
 *  if second string exists as continuous/unbroken chain of characters the first string).
 *
 *
 * Constraints
 * Don't use String.contains method.
 * Case Insensitive
 *
 * Examples
 * isSubstring("go home", "ome") // true
 *
 * isSubstring("go home", "me") // true
 *
 * isSubstring("go home", "abc") // false
 *
 * Source: https://github.com/igorwojda/kotlin-coding-challenges/tree/main/src/test/kotlin/com/igorwojda/string/issubstring
 */
object Substring {

    fun isSubstring(input1: String, input2: String): Boolean {
        return input1 != input1.replace(input2, "")
    }
}
