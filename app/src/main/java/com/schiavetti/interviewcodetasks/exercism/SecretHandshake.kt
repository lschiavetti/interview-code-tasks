package com.schiavetti.interviewcodetasks.exercism

/**
 * Introduction
 * You are starting a secret coding club with some friends and friends-of-friends. Not everyone
 * knows each other, so you and your friends have decided to create a secret handshake that you
 * can use to recognize that someone is a member. You don't want anyone who isn't in the know to
 * be able to crack the code.
 *
 * You've designed the code so that one person says a number between 1 and 31, and the other
 * person turns it into a series of actions.
 *
 * Instructions
 * Your task is to convert a number between 1 and 31 to a sequence of actions in the secret
 * handshake.
 *
 * The sequence of actions is chosen by looking at the rightmost five digits of the number
 * once it's been converted to binary. Start at the right-most digit and move left.
 *
 * The actions for each number place are:
 *
 * 00001 = wink
 * 00010 = double blink
 * 00100 = close your eyes
 * 01000 = jump
 * 10000 = Reverse the order of the operations in the secret handshake.
 * Let's use the number 9 as an example:
 *
 * 9 in binary is 1001.
 * The digit that is farthest to the right is 1, so the first action is wink.
 * Going left, the next digit is 0, so there is no double-blink.
 * Going left again, the next digit is 0, so you leave your eyes open.
 * Going left again, the next digit is 1, so you jump.
 * That was the last digit, so the final code is:
 *
 * wink, jump
 * Given the number 26, which is 11010 in binary, we get the following actions:
 *
 * double blink
 * jump
 * reverse actions
 * The secret handshake for 26 is therefore:
 *
 * jump, double blink
 *
 *
 *   Source: https://exercism.org/tracks/kotlin/exercises
 *
 */
object SecretHandshake {

    private val secretCodePossibleGestures =
        listOf("Reverse", "Jump", "Close your eyes", "Double blink", "Wink")

    fun getSecretCodeInstructions(input: Int): String {
        return if (input in 1..31) {
            val inputAsBinary = Integer.toBinaryString(input)

            inputAsBinary.foldRightIndexed(mutableListOf<String>()) { index, char, list ->
                if ("$char" == "1") {
                    val adjustedIndex = if (inputAsBinary.length == 4) index + 1 else index

                    if (index == 0 && inputAsBinary.length == 5) {
                        list.reversed().toMutableList()
                    } else {
                        list.apply { add(secretCodePossibleGestures[adjustedIndex]) }
                    }
                } else {
                    list
                }
            }.joinToString()
        } else {
            "Input must be a number between 1 and 31"
        }
    }

    /**
     *  Alternate solution:
     */

    enum class Signal {
        WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP
    }

    private infix fun Int.hasBitSet(bit: Int): Boolean = ((this shr bit) and 0x1) == 1

    fun calculateHandshake(number: Int): List<Signal> {
        return mutableListOf<Signal>().apply {
            if (number hasBitSet 0) add(Signal.WINK)
            if (number hasBitSet 1) add(Signal.DOUBLE_BLINK)
            if (number hasBitSet 2) add(Signal.CLOSE_YOUR_EYES)
            if (number hasBitSet 3) add(Signal.JUMP)
            if (number hasBitSet 4) reverse()
        }
    }
}
