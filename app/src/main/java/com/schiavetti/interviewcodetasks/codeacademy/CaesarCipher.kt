package com.schiavetti.interviewcodetasks.codeacademy

/**
 *  In cryptography, a Caesar cipher is a simple encryption technique that shifts every letter in
 *  a message by a certain number of letters. The number of letters to shift is known as the key
 *  or shift parameter. For example, if the key is 1, then the message:
 *
 * “Codecademy is awesome!”
 *
 * becomes:
 *
 * “Dpefdbefnz jt bxftpnf!”
 *
 * Note how every letter in the encrypted message is one letter after each letter in the original
 * message.
 *
 * Create a Caesar cipher function that accepts an integer key and a message string as inputs.
 * If the encrypted letter goes beyond the letter z, it should wrap around to the beginning of
 * the alphabet.
 *
 * For an extra challenge, create another function that decrypts an encoded message for a given
 * key and encoded string.
 *
 *
 * Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 */
object CaesarCipher {

    private val alphabet =
        listOf(
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "x",
            "z",
        )

    /**
     *  Constraints: param 'message' must be a lowercase, portuguese word.
     */
    fun getEncodedMessage(message: String, shiftKey: Int): String {
        return message.map {
            val index = alphabet.indexOf("$it")

            if (index + shiftKey > alphabet.lastIndex) {
                val remainingIndexes = alphabet.lastIndex - index
                val startIndex = shiftKey - remainingIndexes

                alphabet[startIndex]
            } else {
                alphabet[index + shiftKey]
            }
        }.joinToString("")
    }
}
