package com.schiavetti.interviewcodetasks.igorwodja

/**
 * Given variable number of arguments (list of strings) checks whether there are any
 * duplicates among the arguments and return list of all unique duplicates. If no
 * arguments are passes return empty list.
 *
 * Examples
 * getDuplicatedParams("a", "b", "c") //empty list
 *
 * getDuplicatedParams("a", "b", "c", "a") // [a]
 *
 *
 *  Source: https://github.com/igorwojda/kotlin-coding-challenges/tree/main/src/test/kotlin/com/igorwojda/string/getduplicatedarguments
 *
 */
object DuplicateArguments {

    fun getDuplicateParams(input: List<String>): List<String> {
        return input.groupBy { it }
            .filter { it.value.size > 1 }
            .keys
            .toList()
    }
}
