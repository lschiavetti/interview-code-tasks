package com.schiavetti.interviewcodetasks.own

object RegexPractice {

    /**
     *   Extract the first digit from the first occurrence given input.
     *
     *   Example: The following input: "Ivan has 37 children from 12 different wives"
     *   should return "3"
     *
     *   Note that, the Regex pattern \d actually matches "1", "2" and also "3" from
     *   the above mentioned sentence. The Regex.find() method, however, returns
     *   only the first occurrence. In order to return other occurrences, Regex.findAll
     *   should be used.
     */
    fun getFirstDigit(input: String): String {
        return Regex("\\d")
            .find(input)
            ?.value
            .orEmpty()
    }

    /**
     *   Extract all digit (first) occurrences from the given input
     *
     *   Example: The following input: "Ivan has 12 children from 3 different wives"
     *   should return "1", "2" and "3"
     */
    fun getAllDigitOccurrences(input: String): String {
        return Regex("\\d")
            .findAll(input)
            .joinToString { it.value }
    }

    /**
     *   Extract the first digit block from the given input
     *
     *   Example: The following input: "Ivan has 37 children from 12 different wives "
     *   should return "12"
     **/
    fun getFirstDigitsOccurrence(input: String): String {
        return Regex("\\d+")
            .find(input)
            ?.value
            .orEmpty()
    }

    /**
     *   Extract all digits block occurrence from the given input
     *
     *   Example: The following input: "Ivan has 12 children from 3 different wives "
     *   should return "12"
     **/
    fun getAllDigitsOccurrences(input: String): String {
        return Regex("\\d+")
            .findAll(input)
            .joinToString { it.value }
    }

    /**
     *   With Regex, it's possible to capture an element that
     *   is surrounded by a character. For instance, it's possible
     *   to extract the words between quotes in a sentence:
     *
     *   Example: Raul has "almost" twenty-years
     *   The regex "(.+)" returns: almost
     *
     *   Example: Thomas and Tracy have <almost> the same age.
     *   The regex <(.+)> returns: almost
     *
     *   It looks like the parenthesis in Regex, represents a Capturing Group.
     *   Whenever a match happens while using a Capturing Group, there will be
     *   two matches at least: the first one will be the entire match that
     *   includes the surrounding element. The second match will be the group
     *   match, without the surrounding element.
     */
    fun surroundElementStudy(input: String): String {
        return Regex("[(](.+)[)]")
            .find(input)
            ?.groupValues
            ?.last()
            .orEmpty()
    }
}
