package com.schiavetti.interviewcodetasks.igorwodja

/**
 * Given two integers implement a function which determines if they have the same frequency of digits.
 *
 * Examples
 * equalDigitFrequency("123", "321") // true
 *
 * equalDigitFrequency("4557", "745") // false
 *
 */
object DigitFrequency {

    fun hasSameDigitFrequency(input1: Int, input2: Int): Boolean {
        return input1.toSortedString() == input2.toSortedString()
    }

    fun hasSameDigitFrequencyAlternateVersion(input1: Int, input2: Int): Boolean {
        return "$input1".groupingBy { it }.eachCount() == "$input2".groupingBy { it }.eachCount()
    }

    private fun Int.toSortedString(): String {
        return "$this".toCharArray().sorted().joinToString()
    }
}
