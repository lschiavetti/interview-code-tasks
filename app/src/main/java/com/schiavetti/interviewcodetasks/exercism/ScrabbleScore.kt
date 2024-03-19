package com.schiavetti.interviewcodetasks.exercism

/**
 *  Given a word, compute the Scrabble score for that word.
 *
 *  Letter                           Value
 *  A, E, I, O, U, L, N, R, S, T       1
 *  D, G                               2
 *  B, C, M, P                         3
 *  F, H, V, W, Y                      4
 *  K                                  5
 *  J, X                               8
 *  Q, Z                               10
 *
 *
 *  Source: https://exercism.org/tracks/kotlin/exercises/scrabble-score
 */
object ScrabbleScore {

    fun calculateWordScore(word: String): Int {
        val letterAndValueMap = mapOf(
            "a" to 1,
            "e" to 1,
            "i" to 1,
            "o" to 1,
            "u" to 1,
            "l" to 1,
            "n" to 1,
            "r" to 1,
            "s" to 1,
            "t" to 1,
            "d" to 2,
            "g" to 2,
            "b" to 3,
            "c" to 3,
            "m" to 3,
            "p" to 3,
            "f" to 4,
            "h" to 4,
            "v" to 4,
            "w" to 4,
            "y" to 4,
            "k" to 5,
            "j" to 8,
            "x" to 8,
            "q" to 10,
            "z" to 10,
        )

        return word.fold(0) { acc, c ->
            acc + letterAndValueMap.getValue("$c")
        }
    }
}
